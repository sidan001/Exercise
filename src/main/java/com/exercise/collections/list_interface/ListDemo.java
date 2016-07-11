package com.exercise.collections.list_interface;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 8, 75, 23, 153, 67, 974);
      
        ArrayList<Integer> list = new ArrayList<Integer>(integerList);
        list.subList(0, 2).clear();
        System.out.println(list);
        
        
    }
}
