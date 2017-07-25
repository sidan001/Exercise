package com.exercise.collections.list_interface;


import java.util.*;

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




        List<String> nullList = null;
        List<String> emptyList = new ArrayList<>();
        for (String str : emptyList) {
            System.out.println(str);
        }

        //给一个list随机加num个自身的元素
        int size = 5;
        int num = 10;
        for(int i = 0;i< num;i++){
            int random = new Random().nextInt(size);
            System.out.println(random);
        }

        Double aa =null;
        System.out.println(aa ==null);
        Map<String, Double> commissionMap = new HashMap<>();
        Double a = commissionMap.get("hello");
//        double b = commissionMap.get("hello");
        System.out.println(a);


        Long b =null;
        String s = "s" + "_"+"n"+b;
        System.out.println(s);

        System.out.println("null字符串转long："+Long.valueOf("null"));

    }
}
