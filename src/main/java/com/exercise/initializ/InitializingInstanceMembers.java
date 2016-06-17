/**
 * @Description: TODO
 */
package com.exercise.initializ;

public class InitializingInstanceMembers {

	private String myVar = initializeInstanceVariable();

	protected final String initializeInstanceVariable() {
		return "myVar";
	}

	{
		myVar = "non-static-blocks";
	}

	public static void main(String[] args) {
		InitializingInstanceMembers s = new InitializingInstanceMembers();
		System.out.println(s.myVar);
	}
	
	
	
}
