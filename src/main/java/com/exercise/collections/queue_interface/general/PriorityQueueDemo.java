package com.exercise.collections.queue_interface.general;


import java.util.*;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 39, 6, 43, 6, 78, 90, 23,0);
        int a=25,b=0,c=100,d=6 ;
        TreeSet<Integer> ascIntegerTreeSet = new TreeSet<>(integers);

        PriorityQueue<Integer> ascPriorityQueue = new PriorityQueue<>(ascIntegerTreeSet);
        System.out.println("ascPriorityQueue = " + ascPriorityQueue);



        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.offer(3);
        priorityQueue.add(0);
        priorityQueue.add(30);
        priorityQueue.add(23);
        priorityQueue.add(2);
        //priorityQueue.add(null);  no permit null elements
        System.out.println("priorityQueue = " + priorityQueue);


        //TODO 为什么输出不是降序,内部代码没看明白
        Comparator<Integer> integerComparator = Integer::compare;
        Comparator<Integer> reversed = integerComparator.reversed();
        PriorityQueue<Integer> descPriorityQueue = new PriorityQueue<>(reversed);
        descPriorityQueue.addAll(integers);
        System.out.println("descPriorityQueue = " + descPriorityQueue);

        for(int i = 1; i <=11; i++) {
            System.out.printf("inex : %s ,  %s >>> 1 = %s %n " ,i, i-1,(i-1) >>> 1);
        }

    }
}
