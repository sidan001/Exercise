/**
* @Description: TODO
 */
package com.exercise.sort;

/**
 *  
 */
public class Factorial {
	
	 public static void main(String[] args) {
		factorial(5);
	}
	  /**
     * 一个正整数的阶乘，0!=1，n!=(n-1)!×n。
     *  
     */
    private static void factorial(int n){
   	 for(int i = n;i>=1 ;i--){
			int result = 1;
			StringBuilder sb = new StringBuilder(i+"! --> "+i+"");
			for(int j = i;j >=1;j--){
				int temp = j;
				result *= temp;
				if(i != j){
					sb.append("*"+temp);
				}
				if(temp == 1){
					System.out.println(sb.toString()+"="+result);
				}
			}
		}
    }
    
}
