/**
 * @Description: TODO
 */
package com.exercise.Arguments;

/**
 * @author E-mail:liuchou.ewedata.com
 * @date 创建时间：2016年5月19日 下午3:23:16
 * @Description
 * @version 1.0
 * @since
 * 
 */
public class PassPrimitiveByValue {
	public static void main(String[] args) {

		int x = 3;

		// invoke passMethod() with
		// x as argument
		passMethod(x);

		// print x to see if its
		// value has changed
		System.out.println("After invoking passMethod, x = " + x);

	}

	// change parameter in passMethod()
	public static void passMethod(int p) {
		p = 10;
	}
}
