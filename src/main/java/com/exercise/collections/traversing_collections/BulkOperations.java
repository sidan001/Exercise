/**
 * @Description: TODO
 */
package com.exercise.collections.traversing_collections;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class BulkOperations {
	public static void main(String[] args) {
		Ball black = new Ball("black",Color.BLACK,1);
		Ball white = new Ball("white",Color.WHITE,2);
		Ball red = new Ball("red",Color.RED,3);
		
		Collection<Ball> c  = new ArrayList<Ball>();
		c.add(black);
		c.add(white);
		c.add(red);
		
		Set<Ball> singleton = Collections.singleton(black);
		Boolean b = c.containsAll(singleton);
		System.out.println(b);

		b = c.retainAll(singleton);
		System.out.format("retainAll() return %s , c.size == %s %n", b,
				c.size());

		System.out.println("===============================================================");
		List<String> strList = new ArrayList<String>();
		strList.add("hello");
		strList.add("world");
		strList.add("null");
		strList.add("null");
		strList.add("null");
		String resultList = strList.stream().collect(Collectors.joining(","));
		System.out.format("before removeAll 'null' string, strList:  %s %n",
				resultList);
		System.out.format("removeAll 'null' string from strList return  %s %n",
				strList.removeAll(Collections.singleton("null")));
		resultList = strList.stream().collect(Collectors.joining(","));
		System.out.format("after removeAll 'null' string, strList:  %s %n",
				resultList);
		
		
		System.out.println("===============================================================");
		
		Object[] array = strList.toArray();
		
		String[] strArray = {"aaa,bbb"};
		strArray = strList.toArray(strArray);
		System.out.println(strArray.toString());
		
		
		
		
	}
}
