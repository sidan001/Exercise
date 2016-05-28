/**
 * @Description: TODO
 */
package com.exercise.Lambda;

import java.util.ArrayList;
import java.util.List;

/**
 * @author E-mail:liuchou.ewedata.com
 * @date 创建时间：2016年5月27日 下午5:34:38
 * @Description
 * @version 1.0
 * @since
 * 
 */
public class TestList {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("hello");
		list.add("world");
		list.add("aaaa");
		list.add("bbbb");
		list.add("cccc");

		//打印长度大于4的字符串
		list.stream().filter(str -> str.length() > 4)
				.map(str -> str.toString())
				.forEach(str -> System.out.println(str));
		
		//打印长度大于4的字符串
		for(String str : list){
			if(str.length() > 4){
				System.out.println(str);
			}
		}
	}
}
