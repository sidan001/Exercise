/**
 * @Description: TODO
 */
package com.exercise.reflect.members.fields;

import java.lang.reflect.Field;

public class FieldTrouble {
	public Integer val;

	//When using reflection, type checking only occurs at runtime so there is no opportunity to box the value.
	//When using reflection to set or get a field, the compiler does not have an opportunity to perform boxing.
	public static void main(String... args) {
		FieldTrouble ft = new FieldTrouble();
		try {
			Class<?> c = ft.getClass();
			Field f = c.getDeclaredField("val");
			f.setInt(ft, 42); // IllegalArgumentException
			
			//Integer.class.isAssignableFrom(int.class) == false
			//int.class.isAssignableFrom(Integer.class) == false
			
			// production code should handle these exceptions more gracefully
		} catch (NoSuchFieldException x) {
			x.printStackTrace();
		} catch (IllegalAccessException x) {
			x.printStackTrace();
		}
	}
}