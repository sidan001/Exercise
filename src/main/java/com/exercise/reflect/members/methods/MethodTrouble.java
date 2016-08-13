/**
 * @Description: TODO
 */
package com.exercise.reflect.members.methods;

import java.lang.reflect.Method;

//NoSuchMethodException Due to Type Erasure
public class MethodTrouble<T> {
	public void lookup(T t) {
	}

	public void find(Integer i) {
	}

	public static void main(String... args) {
		//$ java MethodTrouble lookup java.lang.Integer
		//$ java MethodTrouble lookup java.lang.Object
		try {
			String mName = args[0];
			Class cArg = Class.forName(args[1]);
			Class<?> c = (new MethodTrouble<Integer>()).getClass();
			
			//Always pass the upper bound of the parameterized type when searching for a method. 
			Method m = c.getMethod(mName, cArg);
			
			System.out.format("Found:%n  %s%n", m.toGenericString());

			// production code should handle these exceptions more gracefully
		} catch (NoSuchMethodException x) {
			x.printStackTrace();
		} catch (ClassNotFoundException x) {
			x.printStackTrace();
		}
	}
}
