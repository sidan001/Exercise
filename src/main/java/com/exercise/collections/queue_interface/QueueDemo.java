/**
 * @Description: TODO
 */
package com.exercise.collections.queue_interface;

import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class QueueDemo {
	public static void main(String[] args) {
		Queue<Integer> q = new ArrayBlockingQueue<Integer>(5);
//		q = new PriorityQueue<Integer>();
		
		System.out.format("q.add(1) return %s%n",q.add(1));
		System.out.format("q.offer(31) return %s%n",q.offer(31));
		System.out.format("q.add(12) return %s%n",q.add(12));
		System.out.format("q.add(65) return %s%n",q.add(65));
		System.out.format("q.add(7) return %s%n",q.add(7));
		
		printQueer(q);
		
		System.out.format("remove element of the head  the queue  : q.remove() return %s%n",q.remove());
		System.out.format("remove element of the head  the queue  : q.poll() return %s%n",q.poll());
		printQueer(q);
		
		System.out.format("Retrieves, but does not remove, the head of this queue  : q.element() return %s%n",q.element());
		printQueer(q);
		System.out.format("Retrieves, but does not remove, the head of this queue  : q.peek() return %s%n",q.peek());
		
	}

	/**
	 *@param q  
	 * 
	*/
	private static void printQueer(Queue<Integer> q) {
		Iterator<Integer> it = q.iterator();
		System.out.print("Queue: [");
		while(it.hasNext()){
			Integer next = it.next();
			System.out.print(next+" ");
		}
		System.out.println("]");
	}
}
