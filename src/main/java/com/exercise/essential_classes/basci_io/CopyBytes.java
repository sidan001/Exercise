package com.exercise.essential_classes.basci_io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class CopyBytes {
    public static void main(String[] args) throws IOException {

//        useIO();
        FileInputStream in = new FileInputStream("xanadu.txt");
        FileOutputStream out = new FileOutputStream("outagain.txt");

        FileChannel inChannel = in.getChannel();
        FileChannel outChannel = out.getChannel();

        ByteBuffer buffer = ByteBuffer.allocate( 1024 );
        int i;
        while ( (i = inChannel.read(buffer)) != -1) {
            buffer.flip();
            outChannel.write(buffer);
            buffer.clear();
        }


    }

    private static void useNIOWriteFile() throws IOException {
        FileOutputStream fout = new FileOutputStream( "writesomebytes.txt" );
        FileChannel fileChannel = fout.getChannel();

        ByteBuffer buffer = ByteBuffer.allocate( 1024 );
        String str = "hello world!";
        byte[] message = str.getBytes();
        for (int i=0; i<message.length; ++i) {
            buffer.put( message[i] );
        }
        buffer.flip();

        fileChannel.write( buffer );
    }

    private static void useNIOReadFile() throws IOException {
        //(1) 从 FileInputStream 获取 Channel
        FileInputStream in = new FileInputStream("xanadu.txt");
        FileChannel fileChannel = in.getChannel();
        //(2) 创建 Buffer
        ByteBuffer buffer = ByteBuffer.allocate(1024);
        // (3)将数据从 Channel 读到 Buffer 中
        fileChannel.read(buffer);
    }

    private static void useIO() throws IOException {
        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            in = new FileInputStream("xanadu.txt");
            out = new FileOutputStream("outagain.txt");
            int c;
            while ((c = in.read()) != -1) {//Reads a byte of data from this input stream
                out.write(c);
            }
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }
}