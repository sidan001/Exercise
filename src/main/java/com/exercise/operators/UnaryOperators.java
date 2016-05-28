/**
* @Description: TODO
 */
package com.exercise.operators;

/**
 * @author   E-mail:liuchou.ewedata.com
 * @date 创建时间：2016年5月11日 下午1:15:57 
 * @Description 
 * @version 1.0 
 * @since  
 *  
 */
public class UnaryOperators {
	public static void main(String[] args) {
        int result = +1;
        // result is now 1
        System.out.println(result);

        result--;
        // result is now 0
        System.out.println(result);

        result++;
        // result is now 1
        System.out.println(result);

        result = -result;
        // result is now -1
        System.out.println(result);

        boolean success = false;
        // false
        System.out.println(success);
        // true
        System.out.println(!success);
    }
}
