/**
 * @Description: TODO
 */
package com.exercise.reflect.members.constructors;


public class ConstructorTrouble {
	private ConstructorTrouble(int i) {
	}

	public static void main(String... args) {
		try {
			Class<?> c = Class.forName("com.exercise.reflect.members.constructors.ConstructorTrouble");
			Object o = c.newInstance(); // InstantiationException

//			Constructor<?>[] declaredConstructors = c.getDeclaredConstructors();
//			try {
//				declaredConstructors[0].newInstance(1);
//			} catch (IllegalArgumentException | InvocationTargetException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
			
			
			// production code should handle these exceptions more gracefully
		} catch (ClassNotFoundException x) {
			x.printStackTrace();
		} catch (InstantiationException x) {
			x.printStackTrace();
		} catch (IllegalAccessException x) {
			x.printStackTrace();
		}
	}
}