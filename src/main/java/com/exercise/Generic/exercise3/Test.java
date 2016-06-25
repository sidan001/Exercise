package com.exercise.Generic.exercise3;

import java.util.Arrays;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		Integer max = Algorithm.max(list, 0, 4);
		System.out.println(max);
		
		
		//取出list区间范围内年龄最大的人
		Person p1 = new Person("P1", 10);
		Person p2 = new Person("P2", 12);
		Person p3 = new Person("P3", 30);
		Person p4 = new Person("P4", 15);
		Person p5 = new Person("P5", 59);
		
		List<Person> pList = Arrays.asList(p1,p2,p3,p4,p5);
		
		// 算法处理的区间：range [begin, end) 在java中的区间都是左开右闭的，比如我们写8到10，返回的结果是8和9
		Person maxPerson = Algorithm.max(pList, 0, pList.size()-1);
		System.out.println(maxPerson.getName() + "  " + maxPerson.getAge()); 
	}
}
