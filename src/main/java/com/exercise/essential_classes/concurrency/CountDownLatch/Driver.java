/**
 * @Description: TODO
 */
package com.exercise.essential_classes.concurrency.CountDownLatch;

import java.util.concurrent.CountDownLatch;

/**
 * The first is a start signal that prevents any worker from proceeding until the driver is ready for them to proceed;
 * The second is a completion signal that allows the driver to wait until all workers have completed.  
 *
 */
public class Driver {
	
	public static void main(String[] args) throws InterruptedException {
		new Driver().main();
	}
	void main() throws InterruptedException {
		int N = 5;
		CountDownLatch startSignal = new CountDownLatch(1);
		CountDownLatch doneSignal = new CountDownLatch(N);

		for (int i = 0; i < N; ++i)
			// create and start threads
			new Thread(new Worker(startSignal, doneSignal)).start();

		doSomethingPrepare(); // don't let run yet
		startSignal.countDown(); // let all threads proceed
		doSomethingElse();
		doneSignal.await(); // wait for all to finish
		System.out.println("all work is done！");
	}

	private void doSomethingPrepare() {
		System.out.println("doSomethingPrepare...");
	}
	private void doSomethingElse() {
		System.out.println("doSomethingElse...");
	}
	
	
}
class Worker implements Runnable {
	   private final CountDownLatch startSignal;
	   private final CountDownLatch doneSignal;
	   Worker(CountDownLatch startSignal, CountDownLatch doneSignal) {
	      this.startSignal = startSignal;
	      this.doneSignal = doneSignal;
	   }
	   @Override
	public void run() {
	      try {
	        startSignal.await();
	        doWork();
	        doneSignal.countDown();
	      } catch (InterruptedException ex) {} // return;
	   }

	   void doWork() { 
		   System.out.println(Thread.currentThread().getName()+" , doWork...");
	   }
 }