/**
* @Description: TODO
 */
package com.exercise.Generic;

import java.util.ArrayList;
import java.util.List;

/**
 * @author   E-mail:liuchou.ewedata.com
 * @date 创建时间：2016年4月1日 下午2:29:39 
 * @Description 
 * @version 1.0 
 * @since  
 *  
 */
public class GenericTypes {
	public static String method(List<String> list){
		System.out.println("invoke metod(List<String> list)");
		return "";
	}
//	public static int method(List<Integer> list){
//		System.out.println("invoke metod(List<Integer> list)");
//		return 1;
//	}	
	
	public static void main(String [] args){
		method(new ArrayList<String>());
//		method(new ArrayList<Integer>());
	}
	
}
