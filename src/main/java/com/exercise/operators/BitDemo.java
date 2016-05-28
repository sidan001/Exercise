/**
* @Description: TODO
 */
package com.exercise.operators;

/**
 * @author   E-mail:liuchou.ewedata.com
 * @date 创建时间：2016年5月11日 下午1:29:12 
 * @Description 
 * @version 1.0 
 * @since  
 *  
 */
public class BitDemo {
	public static void main(String[] args) {
        int bitmask = 0x000F;
        int val = 0x2222;
        System.out.print("val:" + Integer.toBinaryString(val));
        System.out.print(" & ");
        System.out.println("bitmask:" +  Integer.toBinaryString(bitmask));
        
        // prints "2"
        System.out.println(val & bitmask);
    }
}
