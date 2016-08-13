/**
 * @Description: TODO
 */
package com.exercise.essential_classes.nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousServerSocketChannel;
import java.nio.channels.AsynchronousSocketChannel;
import java.nio.channels.CompletionHandler;
import java.util.concurrent.CountDownLatch;

public class PlainNio2EchoServer {
	public void serve(int port) throws IOException {
	        System.out.println("Listening for connections on port " + port);
	        final AsynchronousServerSocketChannel serverChannel = AsynchronousServerSocketChannel.open();
	        InetSocketAddress address = new InetSocketAddress(port);
	        serverChannel.bind(address);             //#1将服务器绑定到端口
	        
	        
	        final CountDownLatch latch = new CountDownLatch(1);
	        //#2启动接收新的客户端连接.一旦接收到一个连接,CompletionHandler将被调用.
	        serverChannel.accept(null, new CompletionHandler<AsynchronousSocketChannel, Object>() {  
	            @Override
	            public void completed(final AsynchronousSocketChannel channel, Object attachment) {
	                serverChannel.accept(null, this);    //#3 再次接收新的客户端连接
	                ByteBuffer buffer = ByteBuffer.allocate(100);
	                channel.read(buffer, buffer, new EchoCompletionHandler(channel)); //#4 在通道上触发一个read操作,给定的CompletionHandler将得到通知,一旦读取到某些数据
	            }

	            @Override
	            public void failed(Throwable throwable, Object attachment) {
	                try {
	                    serverChannel.close();  //#5 发生错误关闭套接字
	                } catch (IOException e) {
	                    // ingnore on close
	                } finally {
	                    latch.countDown();
	                }
	            }
	        });
	        try {
	            latch.await();
	        } catch (InterruptedException e) {
	          Thread.currentThread().interrupt();
	        }

	    }

	private final class EchoCompletionHandler implements
			CompletionHandler<Integer, ByteBuffer> {
		private final AsynchronousSocketChannel channel;

		EchoCompletionHandler(AsynchronousSocketChannel channel) {
			this.channel = channel;
		}

		@Override
        public void completed(Integer result, ByteBuffer buffer) {
            buffer.flip();
         // #6 在通道上触发一个write操作,给定的CompletionHandler将得到通知,一旦某些数据被写入
            channel.write(buffer, buffer, new CompletionHandler<Integer, ByteBuffer>() {  
                @Override
                public void completed(Integer result, ByteBuffer buffer) {
                    if (buffer.hasRemaining()) {
                        channel.write(buffer, buffer, this);    //#7  再次触发write操作,如果ByteBuffer有剩余
                    } else {
                        buffer.compact();
                        channel.read(buffer, buffer, EchoCompletionHandler.this);//#8 在通道上触发read操作,给定的CompletionHandler将得到通知,一旦读取到某些数据
                    }
                }

                @Override
                public void failed(Throwable exc, ByteBuffer attachment) {
                    try {
                        channel.close();
                    } catch (IOException e) {
                        // ingnore on close
                    }
                }
            });
        }

		@Override
		public void failed(Throwable exc, ByteBuffer attachment) {
			try {
				channel.close();
			} catch (IOException e) {
				// ingnore on close
			}
		}
	}
}
