/**
* @Description: TODO
 */
package com.exercise.breakStatement;

/**
 * @author   E-mail:liuchou.ewedata.com
 * @date 创建时间：2016年5月18日 下午3:45:02 
 * @Description 
 * @version 1.0 
 * @since  
 *  
 */
public class BreakWithLabelDemo {
	 public static void main(String[] args) {

	        int[][] arrayOfInts = { 
	            { 32, 87, 3, 589 },
	            { 12, 1076, 2000, 8 },
	            { 622, 127, 77, 955 }
	        };
	        int searchfor = 12;

	        int i;
	        int j = 0;
	        boolean foundIt = false;

	    search:
	        for (i = 0; i < arrayOfInts.length; i++) {
	        	System.out.println(i);
	           for (j = 0; j < arrayOfInts[i].length;j++) {
		                if (arrayOfInts[i][j] == searchfor) {
		                    foundIt = true;
		                    break search;
		                }
	            }
	        }

	        if (foundIt) {
	            System.out.println("Found " + searchfor + " at " + i + ", " + j);
	        } else {
	            System.out.println(searchfor + " not in the array");
	        }
	    }

	    
}
