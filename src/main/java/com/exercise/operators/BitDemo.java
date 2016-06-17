/**
* @Description: TODO
 */
package com.exercise.operators;

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
