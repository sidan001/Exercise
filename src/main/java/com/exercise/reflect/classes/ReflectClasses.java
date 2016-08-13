/**
 * @Description: TODO
 */
package com.exercise.reflect.classes;

import java.io.PrintStream;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public class ReflectClasses {
	public enum E { A, B }
	
	public static void main(String[] args) {

		//Object.getClass()   
		//If an instance of an object is available  
		Class<? extends String> class1 = "foo".getClass();
		System.out.println(class1);//java.lang.String
		
		Class<? extends E> class2 = E.A.getClass();
		System.out.println(class2);//com.exercise.reflect.classes.ReflectClasses$E
		
		byte[] bytes = new byte[1024];
		Class<? extends byte[]> class3 = bytes.getClass();
		System.out.println(class3);//class [B
		
		Set<String> s = new HashSet<String>();
		Class<? extends Set> class4 = s.getClass();
		System.out.println(class4);//java.util.HashSet
		
		
		
		//The .class Syntax
		//If the type is available but there is no instance then it is possible to obtain a Class by appending ".class" to the name of the type.
		Class<Boolean> booleanClass =boolean.class;
		System.out.printf("boolean.class --> %s , Boolean.class() --> %s %n",booleanClass,Boolean.class);
		
		Class<Integer> intClass = int.class;
		System.out.println(intClass);
		
		Class<PrintStream> p = java.io.PrintStream.class;
		
		Class<int[][][]> c = int[][][].class;
		System.out.printf("int[][][].class  --> %s  %n",c);
		System.out.printf("Integer[][][].class  --> %s  %n",Integer[][][].class);
		
		System.out.printf("String[].class  --> %s  %n",String[].class);
		System.out.printf("String[][].class  --> %s  %n",String[][].class);
		System.out.printf("String[][][].class  --> %s  %n",String[][][].class);
		
		System.out.printf("boolean[].class  --> %s  %n",boolean[].class);
		System.out.printf("Boolean[].class  --> %s  %n",Boolean[].class);
		
		//Class.forName()  If the fully-qualified name of a class is available
		try {
			Class<?> reflectClasses = Class.forName("com.exercise.reflect.classes.ReflectClasses");
			System.out.println(reflectClasses);
			
			 Class<?> cDoubleArray = Class.forName("[D");
			 System.out.println(cDoubleArray);
			 
			 Class<?> cByteArray = Class.forName("[B");//一维byte数组
			 System.out.println(cByteArray);
			
			 Class<?> cStringArray = Class.forName("[[Ljava.lang.String;");//二维Strig数组
			 System.out.println(cStringArray);
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		//TYPE Field for Primitive Type Wrappers
		//Each of the primitive types and void has a wrapper class in java.lang that is used for boxing of primitive types to reference types. 
		//Each wrapper class contains a field named TYPE which is equal to the Class for the primitive type being wrapped.
		System.out.printf("Double.TYPE == double.class  --> %s %n",Double.TYPE == double.class);
		
		System.out.printf("Void.TYPE == void.class  --> %s %n",Void.TYPE == void.class);
		
		
		//Methods that Return Classes
		Class<? super String> superclass = String.class.getSuperclass();
		System.out.println(superclass);
		
		 //Class.getClasses()
		//Returns all the public classes, interfaces, and enums that are members of the class including inherited members.
		
		Class<?>[] classes = ReflectClasses.class.getClasses();
		System.out.println(Arrays.asList(classes));
		Class<?>[] character_classes = Character.class.getClasses();
		System.out.println(Arrays.asList(character_classes));
		Class<?>[] character_declaredClasses = Character.class.getDeclaredClasses();
		System.out.println(Arrays.asList(character_declaredClasses));
		
		try {
			Field field = System.class.getField("out");
			Class declaringClass = field.getDeclaringClass();
			System.out.println(declaringClass);
		} catch (NoSuchFieldException | SecurityException e) {
			e.printStackTrace();
		}
		
	}
}
