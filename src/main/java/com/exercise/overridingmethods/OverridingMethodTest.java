/**
* @Description: TODO
 */
package com.exercise.overridingmethods;

public class OverridingMethodTest implements IMethodInterface {

	/* 方法重写的返回类型可以是子类型
	 * <p>Title: getStuff</p>
	* <p>Description: </p>
	* @return
	* @see com.exercise.overridingmethods.IMethodInterface#getStuff()
	 */
	@Override
	public String getStuff() {
		return "stuff";
	}

}
