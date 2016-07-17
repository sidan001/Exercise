package com.exercise.collections.list_interface;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 8, 75, 23, 153, 67, 974);
      
        ArrayList<Integer> list = new ArrayList<Integer>(integerList);
        list.subList(0, 2).clear();
        System.out.println(list);

        LinkedList<Integer> linkedList = new LinkedList<>(integerList);
        System.out.println("linkedList = " + linkedList);

        Integer index_2 = linkedList.get(2);
        System.out.println("index_2 = " + index_2);

        linkedList.add(2,2);
        System.out.println("add(2,2) , linkedList = " + linkedList);

        linkedList.addFirst(0);
        linkedList.addLast(100);
        System.out.println("addFirst(0),addLast(100), linkedList = " + linkedList);

        Integer first = linkedList.getFirst();
        Integer last = linkedList.getLast();
        System.out.printf("getFirst() : %s , getLast() : %s %n" ,first,last);
    }
}
