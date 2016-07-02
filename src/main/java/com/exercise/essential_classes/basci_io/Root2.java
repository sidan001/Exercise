/**
* @Description: TODO
 */
package com.exercise.essential_classes.basci_io;

public class Root2 {
	public static void main(String[] args) {
        int i = 2;
        double r = Math.sqrt(i);
        
        System.out.format("The square root of %d is %f.%n", i, r);//The square root of 2 is 1.414214.
        
        int num = 30;
        System.out.format("The hex string of %d is 0x%x.%n", num,num);//The hex string of 30 is 0x1e.
        
        
        System.out.format("%f, %1$+020.10f %n", Math.PI);
    }
}
