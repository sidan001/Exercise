/**
 * @Description: TODO
 */
package com.exercise.reflect.members.methods;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class AnotherClass {
	private void m() {
	}
}

// An IllegalAccessException is thrown if an attempt is made to invoke a private
// or otherwise inaccessible method.
public class MethodTroubleAgain {
	public static void main(String... args) {
		AnotherClass ac = new AnotherClass();
		try {
			Class<?> c = ac.getClass();
			Method m = c.getDeclaredMethod("m");
//			 m.setAccessible(true); // solution
			Object o = m.invoke(ac); // IllegalAccessException

			// production code should handle these exceptions more gracefully
		} catch (NoSuchMethodException x) {
			x.printStackTrace();
		} catch (InvocationTargetException x) {
			x.printStackTrace();
		} catch (IllegalAccessException x) {
			x.printStackTrace();
		}
	}
}