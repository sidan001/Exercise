/**
* @Description: TODO
 */
package com.exercise.initializ;

/**
 * @author   E-mail:liuchou.ewedata.com
 * @date 创建时间：2016年5月20日 下午2:20:40 
 * @Description 
 * @version 1.0 
 * @since  
 *  
 */
public abstract class AbstractInnitiallizClass {

	public String instanceVar = initializeInstanceVariable();

	protected abstract String initializeInstanceVariable();

}
