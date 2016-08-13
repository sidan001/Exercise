/**
 * @Description: TODO
 */
package com.exercise.essential_classes.concurrency.CountDownLatch;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 *  divide a problem into N parts, 
 *  describe each part with a Runnable that executes that portion and counts down on the latch,
 *   and queue all the Runnables to an Executor.
 */
public class Driver2 {
	public static void main(String[] args) throws InterruptedException {
		
		new Driver2().main();
	
	}
	void main() throws InterruptedException {
		int N = 5;
	     CountDownLatch doneSignal = new CountDownLatch(N);
	     
	     Executor e = Executors.newFixedThreadPool(N);

	     for (int i = 0; i < N; ++i) // create and start threads
	       e.execute(new WorkerRunnable(doneSignal, i));

	     doneSignal.await();           // wait for all to finish
	     System.out.println(N + "  tasks had been done!");
	   }
}

class WorkerRunnable implements Runnable {
	private final CountDownLatch doneSignal;
	private final int i;

	WorkerRunnable(CountDownLatch doneSignal, int i) {
		this.doneSignal = doneSignal;
		this.i = i;
	}

	@Override
	public void run() {
		doWork(i);
		doneSignal.countDown();
	}

	void doWork(int i) {
		System.out.println(Thread.currentThread().getName() + " , doWork...task: "+ i);
	}
}