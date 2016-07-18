/**
* @Description: TODO
 */
package com.exercise.collections.convenience_impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ConvenienceImplementations {
	public static void main(String[] args) {
		
		List<Integer> integerList = Arrays.asList(1, 8, 75, 23, 153, 67, 974);
		// The size of the collection is that of the array and cannot be changed
//		integerList.add(3);
		
		
		
		//Returns an immutable list consisting of n copies of the specified object
		List<Integer> nCopies = Collections.nCopies(10, 2);
//		nCopies.add(23);  //nCopies 的类型为Collections$CopiesList.class 没有实现add
		System.out.println(nCopies);
		
		List<Integer> list = new ArrayList<Integer>(nCopies);
		System.out.println(list);
		
		list.addAll(Collections.nCopies(10, 1));
		System.out.println(list);
		
		list.addAll(10,Collections.nCopies(10, 0));
		System.out.println(list);
		
		
		
		list.removeAll(Collections.singleton(1));
		System.out.println("removeAll 1 in list: " + list);
		
		HashMap<String, Integer> hashMap = new HashMap<String,Integer>();
		hashMap.put("john", 23);
		hashMap.put("tom", 23);
		hashMap.put("jame", 20);
		hashMap.put("peter", 21);
		System.out.println("hashMap: " + hashMap);
		hashMap.values().removeAll(Collections.singleton(23));
		System.out.println("remove value=23 element from hashMap: " + hashMap);
		
		
		//Returns an empty list (immutable). 
		List<String> emptyList = Collections.emptyList();
		//Returns an empty set (immutable). 
		Set<Integer> emptySet = Collections.emptySet();
		//Returns an empty map (immutable). 
		Map<String, Integer> emptyMap = Collections.emptyMap();
		
		
		
		
	}
}
