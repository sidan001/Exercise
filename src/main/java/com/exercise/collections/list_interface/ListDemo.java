package com.exercise.collections.list_interface;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ListDemo {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 8, 75, 23, 153, 67, 974);
        ListIterator<Integer> integerListIterator = integerList.listIterator();


        ArrayList<Integer> list = new ArrayList<Integer>(integerList);
        List<Integer> subList = list.subList(0, 2);
        subList.clear();
        System.out.println(list);

    }
}
