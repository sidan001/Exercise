/**
 * @Description: TODO
 */
package com.exercise.nestedclass;

/**
 */
public class OuterClass {

	private String outstr;
	public int x = 0;

	private void printHello() {
		System.out.println("hello");

	}

	class NestedClass {

		public int x = 1;

		void methodInFirstLevel(int x) {
			System.out.println("x = " + x);
			System.out.println("this.x = " + this.x);
			System.out.println("OuterClass.this.x = " + OuterClass.this.x);
		}

	}

	public static void main(String[] args) {
		OuterClass otc = new OuterClass();
		OuterClass.NestedClass cl = otc.new NestedClass();
		cl.methodInFirstLevel(23);
	}

}
