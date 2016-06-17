/**
* @Description: TODO
 */
package com.exercise.initializ;

public class InstanceObject extends AbstractInnitiallizClass {

	/* (non-Javadoc)
	 * <p>Title: initializeInstanceVariable</p>
	 * <p>Description: </p>
	 * @return
	 * @see com.exercise.initializ.AbstractInnitiallizClass#initializeInstanceVariable()
	 */
	@Override
	protected String initializeInstanceVariable() {
		return "InstanceObject";
	}

	
	public static void main(String[] args) {
		AbstractInnitiallizClass obj = new InstanceObject();
		System.out.println(obj.instanceVar);
		
		
	}
	
}
