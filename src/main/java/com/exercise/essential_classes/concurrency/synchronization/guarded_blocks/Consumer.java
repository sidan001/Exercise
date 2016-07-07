/**
 * @Description: TODO
 */
package com.exercise.essential_classes.concurrency.synchronization.guarded_blocks;

import java.util.Random;
import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {
//	private Drop drop;
//
//	public Consumer(Drop drop) {
//		this.drop = drop;
//	}
	private BlockingQueue<String> drop;

	public Consumer(BlockingQueue<String> drop) {
		this.drop = drop;
	}

	@Override
	public void run() {
	/*	Random random = new Random();
		for (String message = drop.take(); !message.equals("DONE"); message = drop.take()) {
			
			String threadName = Thread.currentThread().getName();
			System.out.format("[%s]MESSAGE RECEIVED: %s%n", threadName, message);
			
//			System.out.format("MESSAGE RECEIVED: %s%n", message);
			try {
				Thread.sleep(random.nextInt(5000));
			} catch (InterruptedException e) {
			}
		}*/
		
		
		  Random random = new Random();
	        try {
	            for (String message = drop.take();
	                 ! message.equals("DONE");
	                 message = drop.take()) {

	            	String threadName = Thread.currentThread().getName();
	    			System.out.format("[%s]MESSAGE RECEIVED: %s%n", threadName, message);
	            	
	                Thread.sleep(random.nextInt(5000));
	            }
	        } catch (InterruptedException e) {}
		
		
		
		
		
		
		
	}
}