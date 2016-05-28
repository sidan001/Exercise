/**
* @Description: TODO
 */
package com.exercise.sort;

import java.util.Comparator;

/**
 * @author   E-mail:liuchou.ewedata.com
 * @date 创建时间：2016年5月4日 下午5:00:15 
 * @Description 
 * @version 1.0 
 * @since  
 *  
 */
public class SortList {

	static class SortComparator implements Comparator<Integer> {

		/* (non-Javadoc)
		 * <p>Title: compare</p>
		* <p>Description: </p>
		* @param o1
		* @param o2
		* @return
		* @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
		 */
		@Override
		public int compare(Integer o1, Integer o2) {
			
			if(o1 > o2){
				return 1;
			}else{
				return -1;
			}
			
		}
	}
	
	
	public void printClassName(){
		System.out.println(getClass().getSimpleName());
		System.out.println(getClass().getName());
	}
	
	public static void main(String[] args) {
/*		List<Integer> list = new ArrayList<Integer>();
		list.add(10);list.add(8);list.add(9);list.add(4);list.add(5);
		
//		SortComparator comparator = new SortList().new SortComparator();//非静态
		SortComparator comparator = new SortComparator();
		Collections.sort(list,comparator);
		
		
		System.out.println("Result is:");
		for (Integer number : list) {
			System.out.print(number + " ");
		}
		System.out.println();*/
		SortList sl = new SortList();
		sl.printClassName();
	}
	
}
