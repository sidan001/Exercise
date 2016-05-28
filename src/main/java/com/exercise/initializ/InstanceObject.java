/**
* @Description: TODO
 */
package com.exercise.initializ;

/**
 * @author   E-mail:liuchou.ewedata.com
 * @date 创建时间：2016年5月20日 下午2:23:35 
 * @Description 
 * @version 1.0 
 * @since  
 *  
 */
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
