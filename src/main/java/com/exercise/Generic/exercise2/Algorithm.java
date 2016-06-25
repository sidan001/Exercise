package com.exercise.Generic.exercise2;

/** 
 * Write a generic method to exchange the positions of two different elements in an array.
 */
public class Algorithm {
	public static <T> void swap(T[] a, int i, int j) {
		T temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	
	public static void main(String[] args) {
		String [] arrays = new String[]{"a","b","c"};
		
		Algorithm.swap(arrays, 0, 1);
		
		for (String s : arrays){
			System.out.println(s);
		}
	}
}
