package com.exercise;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by liuchou on 16/6/28.
 */
public class TestSet {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<Integer>();
        numbers.add(3);
        numbers.add(1);
        numbers.add(2);
        System.out.println("numbers:  " + numbers);//numbers:  [1, 2, 3]

        Set<String> numbers1 = new HashSet<String>();
        numbers1.add("c");
        numbers1.add("a");
        numbers1.add("b");
        System.out.println("numbers1:  " + numbers1);//numbers1:  [a, b, c]


        Set<Integer> numbers2 = new LinkedHashSet<Integer>();
        numbers2.add(3);
        numbers2.add(1);
        numbers2.add(2);
        System.out.println("numbers2:  " + numbers2);//numbers2:  [3, 1, 2]


        String a = "abcd";
        String b = "abc";

        System.out.println(a == b);
        System.out.println(a.equals(b));

        String aa = new String("abc");
        String bb = new String("abcd");
        System.out.println(aa == bb);
        System.out.println(aa.equals(bb));












        numbers2 = null;
        for (Integer integer : numbers2) {
            System.out.println(integer);
        }
    }
}
