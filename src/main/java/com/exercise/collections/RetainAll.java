/**
* @Description: TODO
 */
package com.exercise.collections;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class RetainAll {

	
	
	public static void main(String[] args) {
		
		
		int [] arr = {1,4,3,2,6,7,5,9,8,10};
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ",");
		}
		Arrays.sort(arr);
		
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ",");
		}
		
		
		/* List<String> list1 = Arrays.asList("cat", "dog","ant1", "bird", "cat");
		 List<String> list2 = Arrays.asList("cat2", "dog2","ant", "bird", "cat");
		 List<String> list3 = Arrays.asList("cat3", "dog3","ant", "bird", "cat");
		 List<String> list4 = Arrays.asList("cat4", "dog4","ant", "bird", "cat");
		 List<String> list5 = Arrays.asList("cat5", "dog5","ant", "bird", "cat");
		 
		 Set<String> set1 = new HashSet<String>(list1);
		 Set<String> set2 = new HashSet<String>(list2);
		 Set<String> set3 = new HashSet<String>(list3);
		 Set<String> set4 = new HashSet<String>(list4);
		 Set<String> set5 = new HashSet<String>(list5);
		 
		 Set<String> retailnAll = new RetainAll().retailnAll(set1,set2,set3,set4,set5);
		 System.out.println(retailnAll);*/
	}
	
	//求多个set的交集
	public <E> Set<E> retailnAll(Set<E> ... sets){
		int length = sets.length;
		
		Map<E,Integer> map = new HashMap<E,Integer>();
		
		for(Set<E> set : sets){
			for(E e : set){
				Integer integer = map.get(e);
				if(integer != null){
					map.put(e, integer + 1);
				}else{
					map.put(e, 1);
				}
			}
		}
		
		Set<Entry<E, Integer>> entrySet = map.entrySet();
		Iterator<Entry<E, Integer>> iterator = entrySet.iterator();
		while(iterator.hasNext()){
			Entry<E, Integer> next = iterator.next();
			if (next.getValue() != length) {
				iterator.remove();
			}
		}
		
		return map.keySet();
	}
}
