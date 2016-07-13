/**
 * @Description: TODO
 */
package com.exercise.collections.list_interface;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ListTrim {
	static void listTrim(List<String> strings) {
		for (ListIterator<String> lit = strings.listIterator(); lit.hasNext();) {
			lit.set(lit.next().trim());
		}
	}

	public static void main(String[] args) {
		List<String> l = Arrays.asList(" red ", " white ", " blue ");
		listTrim(l);
		for (String s : l) {
			System.out.format("\"%s\"%n", s);
		}
	}
}