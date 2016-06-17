/**
 * @Description: TODO
 */
package com.exercise.initializ;

public class StaticInitialization {
	public static String staticVar = initializeClassVariable();

	
	private static String initializeClassVariable() {
		return "hello world";
	}

	
	public static void main(String[] args) {
		StaticInitialization s = new StaticInitialization();
		System.out.println(s.staticVar);
	}
}
