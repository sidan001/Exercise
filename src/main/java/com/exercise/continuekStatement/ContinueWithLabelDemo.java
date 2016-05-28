/**
 * @Description: TODO
 */
package com.exercise.continuekStatement;

/**
 * @author E-mail:liuchou.ewedata.com
 * @date 创建时间：2016年5月19日 上午11:07:23
 * @Description
 * @version 1.0
 * @since
 * 
 */
public class ContinueWithLabelDemo {
	public static void main(String[] args) {

		String searchMe = "Look for a substring in me";
		String substring = "sub";
		boolean foundIt = false;

		int max = searchMe.length() - substring.length();

		test: 
			for (int i = 0; i <= max; i++) {
				int n = substring.length();
				int j = i;
				System.out.println(j);
				int k = 0;
				while (n-- != 0) {
					if (searchMe.charAt(j++) != substring.charAt(k++)) {
						continue test;
					}
				}
				foundIt = true;
				break test;
		}
		System.out.println(foundIt ? "Found it" : "Didn't find it");
	}
}
