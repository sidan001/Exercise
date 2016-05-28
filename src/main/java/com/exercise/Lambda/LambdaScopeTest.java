/**
 * @Description: TODO
 */
package com.exercise.Lambda;

import java.util.function.Consumer;

/**
 * @author E-mail:liuchou.ewedata.com
 * @date 创建时间：2016年5月27日 下午6:15:06
 * @Description
 * @version 1.0
 * @since
 * 
 */
public class LambdaScopeTest {
	public int x = 0;

	class FirstLevel {

		public int x = 1;

		void methodInFirstLevel(int x) {

			// The following statement causes the compiler to generate
			// the error "local variables referenced from a lambda expression
			// must be final or effectively final" in statement A:
			//
//			 x = 99;

			Consumer<Integer> myConsumer = (y) -> {//Lambda expression's parameter x cannot redeclare another local variable defined in an enclosing scope. 
				System.out.println(getName());
				System.out.println("x = " + x); // Statement A
				System.out.println("y = " + y);
				System.out.println("this.x = " + this.x);
				System.out.println("LambdaScopeTest.this.x = "
						+ LambdaScopeTest.this.x);
			};

			myConsumer.accept(x);

		}
		
		
		private String getName() {
			return "hello";
		}
	}

	public static void main(String... args) {
		LambdaScopeTest st = new LambdaScopeTest();
		LambdaScopeTest.FirstLevel fl = st.new FirstLevel();
		fl.methodInFirstLevel(23);
	}
}
