/**
 * @Description: TODO
 */
package com.exercise.reflect.members.fields;

import java.lang.reflect.Field;
import java.util.List;

public class FieldSpy<T> {
	public boolean[][] b = { { false, false }, { true, true } };
	public String name = "Alice";
	public List<Integer> list;
	public T val;

	public static void main(String... args) {
		try {
			Class<?> c = Class.forName(args[0]);
			Field f = c.getField(args[1]);
			System.out.format("Type: %s%n", f.getType());
			System.out.format("GenericType: %s%n", f.getGenericType());

			// production code should handle these exceptions more gracefully
		} catch (ClassNotFoundException x) {
			x.printStackTrace();
		} catch (NoSuchFieldException x) {
			x.printStackTrace();
		}
	}
	
//	$ java FieldSpy FieldSpy b
//	Type: class [[Z
//	GenericType: class [[Z
//	$ java FieldSpy FieldSpy name
//	Type: class java.lang.String
//	GenericType: class java.lang.String
//	$ java FieldSpy FieldSpy list
//	Type: interface java.util.List
//	GenericType: java.util.List<java.lang.Integer>
//	$ java FieldSpy FieldSpy val
//	Type: class java.lang.Object
//	GenericType: T
}
