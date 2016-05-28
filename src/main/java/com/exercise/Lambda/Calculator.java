/**
 * @Description: TODO
 */
package com.exercise.Lambda;

/**
 * @author E-mail:liuchou.ewedata.com
 * @date 创建时间：2016年5月27日 下午5:56:39
 * @Description
 * @version 1.0
 * @since
 * 
 */
public class Calculator {
	interface IntegerMath {
		int operation(int a, int b);
	}

	public int operateBinary(int a, int b, IntegerMath op) {
		return op.operation(a, b);
	}

	public static void main(String... args) {

		Calculator myApp = new Calculator();
		IntegerMath addition = (a, b) -> a + b;
		IntegerMath subtraction = (a, b) -> a - b;
		System.out.println("40 + 2 = " + myApp.operateBinary(40, 2, addition));
		System.out.println("20 - 10 = "
				+ myApp.operateBinary(20, 10, subtraction));
	}
}
