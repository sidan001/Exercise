/**
 * @Description: TODO
 */
package com.exercise.reflect.members.methods;

import static java.lang.System.out;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class MethodModifierSpy {

	private static int count;

	private static synchronized void inc() {
		count++;
	}

	private static synchronized int cnt() {
		return count;
	}

	public static void main(String... args) {
		// java MethodModifierSpy java.lang.Object wait
		//java MethodModifierSpy java.lang.StrictMath toRadians
		//java MethodModifierSpy com.exercise.reflect.members.methods.MethodModifierSpy  inc
		//java MethodModifierSpy java.lang.Class getConstructor
		//java MethodModifierSpy java.lang.String compareTo
		try {
			Class<?> c = Class.forName(args[0]);
			Method[] allMethods = c.getDeclaredMethods();
			for (Method m : allMethods) {
				if (!m.getName().equals(args[1])) {
					continue;
				}
				out.format("%s%n", m.toGenericString());
				out.format("  Modifiers:  %s%n",
						Modifier.toString(m.getModifiers()));
				out.format("  [ synthetic=%-5b var_args=%-5b bridge=%-5b ]%n",
						m.isSynthetic(), m.isVarArgs(), m.isBridge());// a bridge method (compiler-generated to support generic interfaces).

				inc();
			}
			out.format("%d matching overload%s found%n", cnt(),
					(cnt() == 1 ? "" : "s"));

			// production code should handle this exception more gracefully
		} catch (ClassNotFoundException x) {
			x.printStackTrace();
		}
	}
}
