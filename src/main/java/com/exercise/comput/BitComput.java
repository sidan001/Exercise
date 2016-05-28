/**
* @Description: TODO
 */
package com.exercise.comput;

/**
 * java定义了位运算符，应用于整数类型(int)，长整型(long)，短整型(short)，字符型(char)，和字节型(byte)等类型。<br>
 * 位运算符作用在所有的位上，并且按位运算。假设a = 60，和b = 13;它们的二进制格式表示将如下：
 *
 * <pre>
 * A = 0011 1100
 * B = 0000 1101
 * -----------------
 * A&b = 0000 1100
 * A | B = 0011 1101
 * ^ B = 0011 0001
 * ~A= 1100 0011
 * </pre>
 * 二进制转十进制：
 * <pre>
 * 例如：二进制数1101.01转化成十进制
 * 1101.01（2）=1*2<sup>0</sup>+0*2<sup>1</sup>+1*2<sup>2</sup>+1*2<sup>3</sup> +0*2<sup>-1</sup>+1*2<sup>-2</sup>=1+0+4+8+0+0.25=13.25
 * 所以总结起来通用公式为：
 * abcd.efg(2)=d*2<sup>0</sup>+c*2<sup>1</sup>+b*2<sup>2</sup>+a*2<sup>3</sup>+e*2<sup>-1</sup>+f*2<sup>-2</sup>+g*2<sup>-3</sup>
 * </pre>
 * @author E-mail:liuchou.ewedata.com
 * @date 创建时间：2016年3月24日 下午4:18:33
 * @Description
 * @version 1.0
 * @since
 * 
 */
public class BitComput {
	/**
	 * A = 0011 1100<br>
	 *  << 按位左移运算符。左操作数  按位左移 右操作数指定的位数。<code>	A << 2得到240，即 1111 0000</code> <br>
	 *  <pre> 向左移n位相当于是<b>乘</b>以2<sup>n</sup>次方</pre>
	 *  
	 *  >> 	按位右移运算符。左操作数  按位右移 右操作数指定的位数。	<code>A >> 2得到15即 1111</code> <br>
	 *  <pre> 向右移n位相当于是<b>除</b>与2<sup>n</sup>次方</pre>
	 * 
	*/
	public void moveOperator() {
		
		  int capacity = 8;capacity >>= 3;// 向右移动一位就相当于是除与2的1次方，所以向右移3位就是8除8=1. 
		  System.out.println(capacity);
		  int  a =1; a <<= 3;//向左移动就是相乘。 
		  System.out.println(a); System.out.println(1 << 30);
	}
	
	/**
	 *  按位与操作符，当且仅当两个操作数的某一位都非0时候结果的该位才为1。
	 *  <pre>
	 *  A = 0011 1100 
	 *  B = 0000 1101 
	 *  A&b = 0000 1100
	 *  </pre>
	 * 
	*/
	public void bitOperator() {
		int a = 60; /* 60 = 0011 1100 */ 
	     int b = 13; /* 13 = 0000 1101 */
	     int c = 0;
	     c = a & b;       /* 12 = 0000 1100 */
	     System.out.println("a & b = " + c );

	     c = a | b;       /* 61 = 0011 1101 */
	     System.out.println("a | b = " + c );

	     c = a ^ b;       /* 49 = 0011 0001 */
	     System.out.println("a ^ b = " + c );

	     c = ~a;          /*-61 = 1100 0011 */
	     System.out.println("~a = " + c );

	     c = a << 2;     /* 240 = 1111 0000 */
	     System.out.println("a << 2 = " + c );

	     c = a >> 2;     /* 15 = 1111 */
	     System.out.println("a >> 2  = " + c );
	  
	     c = a >>> 2;     /* 15 = 0000 1111 */
	     System.out.println("a >>> 2 = " + c );
	}
	
	
	
	
}
