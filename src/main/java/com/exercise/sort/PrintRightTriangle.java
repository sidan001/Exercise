/**
* @Description: TODO
 */
package com.exercise.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 */
public class PrintRightTriangle {

	public static void main(String[] args) {
		printTriangle();
	}
	
	//打印下面形式的数字
	// 1  
	// 7 2  
	// 12 8 3  
	// 16 13 9 4  
	// 19 17 14 10 5  
	// 21 20 18 15 11 6  
	public static void printTriangle(){
		String s = "";
		for (int i = 1;i< 7; i++){
			List<String> list = new ArrayList<String>();
			list.add(String.valueOf(i));
			for (int j = i; j > 0 ;){
				int temp = j;
				int n = 5;
				
				while(j > 0){
					if(--j > 0){
						temp += n--;
						list.add(String.valueOf(temp));
					}
				}
			}
			Collections.reverse(list);
			
			for( int index = 0; index < list.size();index++ ){
	            s += " " + list.get(index);
	        }
			s += "  \n";
		}
		System.out.println(s);
	}
}
