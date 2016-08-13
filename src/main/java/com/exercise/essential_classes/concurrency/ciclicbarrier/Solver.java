/**
 * @Description: TODO
 */
package com.exercise.essential_classes.concurrency.ciclicbarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 *  
 */
public class Solver {
	final int N;
	final float[][] data;
	final CyclicBarrier barrier;

	class Worker implements Runnable {
		int myRow;

		Worker(int row) {
			myRow = row;
		}
		@Override
		public void run() {
			while (!done()) {
				processRow(myRow);
				try {
					barrier.await();
				} catch (InterruptedException ex) {
					return;
				} catch (BrokenBarrierException ex) {
					return;
				}
			}
		}
		private boolean done() {
			return false;
		}
		private void processRow(int myRow2) {
			float sum = 0;
			for (int i = 0; i < data[myRow2].length; ++i){
				sum += data[myRow2][i];
			}
			System.out.printf("the sum result of  row %d  is %f %n", myRow2,sum);
		}
	}

	public Solver(float[][] matrix) {
		data = matrix;
		N = matrix.length;
		Runnable barrierAction = new Runnable() {
			@Override
			public void run() {
				mergeRows();
			}

		
		};
		barrier = new CyclicBarrier(N, barrierAction);
		for (int i = 0; i < N; ++i)
			new Thread(new Worker(i)).start();

		waitUntilDone();
	}

	private void waitUntilDone() {
		System.out.println("was done！");
	}
	private void mergeRows() {
		System.out.println("barrierAction：............");
	}
	
	
	
	public static void main(String[] args) {
//		float[][] m = new float[2][3];
		float[][] m = {
				{1,2,3},{4,5,6},{7,8,2}
		};
		
		new Solver(m);
	}
	
	
	
	
	
	
	
	
	
}
