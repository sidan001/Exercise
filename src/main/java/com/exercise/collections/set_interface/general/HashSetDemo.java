/**
* @Description: TODO
 */
package com.exercise.collections.set_interface.general;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

public class HashSetDemo {

	public static void main(String[] args) {
		//HashSet 不保证插入顺序
		List<Integer> integers = Arrays.asList(1, 2, 39, 6, 43, 6, null,78,null, 90,23, 23);
		HashSet<Integer> integerHashSet = new HashSet<>(integers);
		System.out.println("integerHashSet = " + integerHashSet);


		String e = "hello";
		
		Element ele = new HashSetDemo().new Element();
		ele.name = e;
		
		
		HashSet<String> hashSet = new HashSet<>();
	
		boolean add = hashSet.add(e);
		System.out.println(add);
		
		boolean contains = hashSet.contains(e);
		System.out.println(contains);
		
		HashSet<String>  clone = (HashSet<String>) hashSet.clone();
		System.out.println(clone);
		
		boolean remove = hashSet.remove(e);
		System.out.println(remove);
		
		boolean empty = hashSet.isEmpty();
		System.out.println(empty);
		
		int size = hashSet.size();
		System.out.println(size);
		
		
		//a shallow copy of this HashSet instance: the elements themselves are not cloned.
		HashSet<Element> elementHashSet = new HashSet<Element>();
		elementHashSet.add(ele);
		elementHashSet.stream().forEach(el -> System.out.println("oringe element name: " + el.name ));
		HashSet<Element> clone2 = (HashSet<Element>) elementHashSet.clone();
		clone2.stream().forEach(el -> System.out.println("clone element name: " + el.name ));
		ele.name = "world";
		clone2.stream().forEach(el -> System.out.println("after change the 'ele' the clone element name: " + el.name ));
		elementHashSet.stream().forEach(el -> System.out.println("after change the 'ele' the oringe element name: " + el.name ));
		
		
		
	}
	
	private class Element{
		private String name;
	}
}
