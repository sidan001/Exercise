/**
 * @Description: TODO
 */
package com.exercise.collections.object_ordering;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NameSort {
	public static void main(String[] args) {
		Name nameArray[] = { new Name("John", "Smith"), new Name("Karl", "Ng"),
				new Name("Jeff", "Smith"), new Name("Tom", "Rich") };

		List<Name> names = Arrays.asList(nameArray);
		Collections.sort(names);
		System.out.println(names);
	}
}
