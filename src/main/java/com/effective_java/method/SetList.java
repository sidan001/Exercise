package com.effective_java.method;


import java.util.*;

public class SetList {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<Integer>();
        List<Integer> list = new ArrayList<Integer>();
        for (int i = -3; i < 3; i++) {
            set.add(i);
            list.add(i);
        }
        for (int i = 0; i < 3; i++) {
            set.remove(i);
//            list.remove(i);
            list.remove(Integer.valueOf(i));
        }
        System.out.println(set + " " + list);

        System.out.println(1.03 - .42);
    }
}