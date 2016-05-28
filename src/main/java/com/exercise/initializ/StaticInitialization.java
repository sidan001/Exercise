/**
 * @Description: TODO
 */
package com.exercise.initializ;

/**
 * @author E-mail:liuchou.ewedata.com
 * @date 创建时间：2016年5月20日 下午1:32:39
 * @Description
 * @version 1.0
 * @since
 * 
 */
public class StaticInitialization {
	public static String staticVar = initializeClassVariable();

	
	private static String initializeClassVariable() {
		return "hello world";
	}

	
	public static void main(String[] args) {
		StaticInitialization s = new StaticInitialization();
		System.out.println(s.staticVar);
	}
}
