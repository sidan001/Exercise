package com.exercise.essential_classes.concurrency.synchronization.guarded_blocks;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;

public class ProducerConsumerExample {
	public static void main(String[] args) {
//		Drop drop = new Drop();
//		(new Thread(new Producer(drop))).start();
//		(new Thread(new Consumer(drop))).start();
		//模拟多个消费者，生产者生产完后，最终会只有一个消费者拿到生产结束的标志（DONE），其他的消费者会无限等待生产结束标志。
//		(new Thread(new Consumer(drop))).start();
		
		
		
		 BlockingQueue<String> drop =
		            new SynchronousQueue<String> ();
		        (new Thread(new Producer(drop))).start();
		        (new Thread(new Consumer(drop))).start();
	}
}