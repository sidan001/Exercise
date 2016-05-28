/**
 * @Description: TODO
 */
package com.exercise.initializ;

/**
 * @author E-mail:liuchou.ewedata.com
 * @date 创建时间：2016年5月20日 下午2:00:54
 * @Description
 * @version 1.0
 * @since
 * 
 */
public class InitializingInstanceMembers {

	private String myVar = initializeInstanceVariable();

	protected final String initializeInstanceVariable() {
		return "myVar";
	}

	{
		myVar = "non-static-blocks";
	}

	public static void main(String[] args) {
		InitializingInstanceMembers s = new InitializingInstanceMembers();
		System.out.println(s.myVar);
	}
	
	
	
}
