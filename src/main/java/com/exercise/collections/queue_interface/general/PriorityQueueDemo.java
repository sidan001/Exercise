package com.exercise.collections.queue_interface.general;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.TreeSet;

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
        /*The PriorityQueue class is a priority queue based on the heap data structure
         * 二叉树关系的元素存储到一个数组中:
         * 父节点为n求子节点的index： left(n) = n * 2 + 1   right(n) = n * 2 + 2 
         * 子节点为k,求父节点的index： (k-1) >>> 1
         * 降序排序：要求父节点要大于子节点，否则交换位置
         */
        Comparator<Integer> integerComparator = Integer::compare;
        Comparator<Integer> reversed = integerComparator.reversed();
        PriorityQueue<Integer> descPriorityQueue = new PriorityQueue<>(reversed);
        descPriorityQueue.addAll(integers);
        //根据二叉树结构，从上到下，从左到右
        System.out.println("descPriorityQueue = " + descPriorityQueue.toString());
       
   
        
        for(int i = 1; i <=11; i++) {
            System.out.printf("inex : %s ,  %s >>> 1 = %s %n " ,i, i-1,(i-1) >>> 1);
        }

    }
}
