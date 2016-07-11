/**
 * @Description: TODO
 */
package com.exercise.collections.deque_interface;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class DequeDemo {
	public static void main(String[] args) {
		List<String> asList = Arrays.asList("||");
		LinkedList<String> linkedList = new LinkedList<String>(asList);
		
		System.out.println("linkedList: "+linkedList);
		/*Insert*/
		//First Element (Beginning of the Deque instance)
		//push -->addFirst
		linkedList.push("push");System.out.println("push: "+linkedList);
		//offerFirst --> addFirst --> linkFirst
		linkedList.addFirst("addFirst"); System.out.println("addFirst: "+linkedList);
		linkedList.offerFirst("offerFirst");System.out.println("offerFirst: "+linkedList);
		//Last Element (End of the Deque instance)
		//offerLast --> addLast --> linkLast
		linkedList.addLast("addLast"); System.out.println("addLast: "+linkedList);
		linkedList.offerLast("offerLast");System.out.println("offerLast： " + linkedList);
		
		/*Examine*/
		String peek = linkedList.peek(); System.out.println("peek: "+peek);
		String getFirst = linkedList.getFirst(); System.out.println("getFirst: "+getFirst);
		String peekFirst = linkedList.peekFirst();System.out.println("peekFirst: "+peekFirst);
		String getLast = linkedList.getLast(); System.out.println("getLast: "+getLast);
		String peekLast = linkedList.peekLast();System.out.println("peekLast: "+peekLast);
		
		/*Remove*/
		String pop = linkedList.pop(); System.out.println("pop() return: "+ pop + ",  linkedList: "+linkedList);
		String removeFirst = linkedList.removeFirst(); System.out.println("removeFirst() return: "+ removeFirst + ",  linkedList: "+linkedList);
		String pollFirst = linkedList.pollFirst();System.out.println("pollFirst() return: "+ pollFirst + ",  linkedList: "+linkedList);
		String removeLast = linkedList.removeLast(); System.out.println("removeLast() return: "+ removeLast + ",  linkedList: "+linkedList);
		String pollLast = linkedList.pollLast();System.out.println("pollLast() return: "+ pollLast + ",  linkedList: "+linkedList);
		
		

		
		
		
		
		
		
		
		
		
		
	}
}
