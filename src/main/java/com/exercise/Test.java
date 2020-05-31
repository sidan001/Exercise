package com.exercise;

import java.lang.reflect.Field;
import java.util.Collection;

/**
 * Created by chou on 2020/2/27.
 */
public class Test {
    public static void main(String[] args) {

//        int i = 0;
//        int b = i++;
//
//        HashSet<String> strings = new HashSet<>();
//        strings.add("3");
//        strings.add("3");
//        System.out.println(strings);
//
//        String s1 = new String("计算机");
//        String s2 = s1.intern();
//        System.out.println(s1 == s2);
//
//
//        String str1 = "str";
//        String str2 = "ing";
//
//        String str4 = str1 + str2; //在堆上创建的新的对象
//        String str3 = "str" + "ing";//常量池中的对象
//
//
//        System.out.println(str4.hashCode());
//        System.out.println(str3 == str4);//false

        String zhStr = new StringBuilder("计算机").append("软件").toString();
        System.out.println(zhStr == zhStr.intern());

        String strcb = new StringBuilder("1").append("2").toString();
        System.out.println(strcb == strcb.intern());

        String javaStr = new StringBuilder("ja").append("va").toString();
        System.out.println(javaStr == javaStr.intern());


        int[] nums = new int[5];

        nums[1]++;
        nums[3]--;
        System.out.println(nums[1]);
        System.out.println(nums[3]);


        int i = 0;
        for (; i < 4; i++) {
        }

        System.out.println(i);

        Math.random();


    }

}



