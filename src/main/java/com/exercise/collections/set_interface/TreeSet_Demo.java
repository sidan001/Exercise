/**
 * @Description: TODO
 */
package com.exercise.collections.set_interface;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class TreeSet_Demo {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("cat", "dog", "dog", "ant", "ant",
				"bird", "cat");
		// TreeSet按值排序
		TreeSet<String> treeSet = new TreeSet<String>(list);
		System.out.println(treeSet);
		
		
		System.out.format(" the first (lowest) element    --> %s%n", treeSet.first());
		System.out.format(" the last (highest) element     --> %s%n", treeSet.last());
		System.out.format(" range from 'bird', inclusive, to 'dog', exclusive   --> %s%n", treeSet.subSet("bird", "dog"));
		System.out.format(" strictly less than 'cat'   --> %s%n", treeSet.headSet("cat"));
		System.out.format(" greater than or equal to 'cat'   --> %s%n", treeSet.tailSet("cat"));
		
		Comparator<? super String> comparator = treeSet.comparator();
	}
}
