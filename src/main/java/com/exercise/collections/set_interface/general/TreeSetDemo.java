/**
* @Description: TODO
 */
package com.exercise.collections.set_interface.general;

import java.util.*;

public class TreeSetDemo {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("cat", "dog", "dog","ant", "ant", "bird", "cat");

        //TreeSet(Collection<? extends E> c)
        TreeSet<String> stringTreeSet = new TreeSet<>(list);
        System.out.println("stringTreeSet: " + stringTreeSet);

        Comparator<String> compareTo = String::compareTo;
        Comparator<String> reversed = compareTo.reversed();

        //TreeSet(Comparator<? super E> comparator)
        TreeSet<String> descStringTreeSet = new TreeSet<>(reversed);
        descStringTreeSet.addAll(stringTreeSet);
        System.out.println("reverse stringTreeSet: " + descStringTreeSet);

        //TreeSet(Comparator<? super E> comparator)
        descStringTreeSet = new TreeSet<>((s1,s2) -> s2.compareTo(s1));
        descStringTreeSet.addAll(list);
        System.out.println("descStringTreeSet: "+ descStringTreeSet);


        //ceiling方法注意treeSet的排序规则
        List<Integer> integers = Arrays.asList(1, 2, 39, 6, 43, 6, 78, 90, 23);
        int a=25,b=0,c=100,d=6 ;
        TreeSet<Integer> ascIntegerTreeSet = new TreeSet<>(integers);
        System.out.println("ascIntegerTreeSet : "+ ascIntegerTreeSet);
        System.out.println("ceiling :     >=");
        System.out.format("the least element in 'ascIntegerTreeSet' >=  %s is %s %n" ,b,ascIntegerTreeSet.ceiling(b));
        System.out.format("the least element in 'ascIntegerTreeSet' >=  %s is %s %n" ,d,ascIntegerTreeSet.ceiling(d));
        System.out.format("the least element in 'ascIntegerTreeSet' >=  %s is %s %n" ,a,ascIntegerTreeSet.ceiling(a));
        System.out.format("the least element in 'ascIntegerTreeSet' >=  %s is %s %n" ,c,ascIntegerTreeSet.ceiling(c));
        System.out.format("the greatest element in 'ascIntegerTreeSet' <=  %s is %s %n" ,b,ascIntegerTreeSet.floor(b));
        System.out.format("the greatest element in 'ascIntegerTreeSet' <=  %s is %s %n" ,d,ascIntegerTreeSet.floor(d));
        System.out.format("the greatest element in 'ascIntegerTreeSet' <=  %s is %s %n" ,a,ascIntegerTreeSet.floor(a));
        System.out.format("the greatest element in 'ascIntegerTreeSet' <=  %s is %s %nt" ,c,ascIntegerTreeSet.floor(c));

        TreeSet<Integer> descIntegerTreeSet = new TreeSet<>((num1, num2) -> num2.compareTo(num1));
        descIntegerTreeSet.addAll(integers);
        System.out.println("descIntegerTreeSet : "+ descIntegerTreeSet);
        System.out.format("the least element in 'descIntegerTreeSet' <=  %s is %s %n" ,b,descIntegerTreeSet.ceiling(b));
        System.out.format("the least element in 'descIntegerTreeSet' <=  %s is %s %n" ,d,descIntegerTreeSet.ceiling(d));
        System.out.format("the least element in 'descIntegerTreeSet' <=  %s is %s %n" ,a,descIntegerTreeSet.ceiling(a));
        System.out.format("the least element in 'descIntegerTreeSet' <=  %s is %s %n" ,c,descIntegerTreeSet.ceiling(c));
        System.out.format("the greatest element in'descIntegerTreeSet' >=  %s is %s %n" ,b,descIntegerTreeSet.floor(b));
        System.out.format("the greatest element in'descIntegerTreeSet' >=  %s is %s %n" ,d,descIntegerTreeSet.floor(d));
        System.out.format("the greatest element in 'descIntegerTreeSet' >=  %s is %s %n" ,a,descIntegerTreeSet.floor(a));
        System.out.format("the greatest element in 'descIntegerTreeSet' >=  %s is %s %n" ,c,descIntegerTreeSet.floor(c));




        System.out.println("ascIntegerTreeSet : "+ ascIntegerTreeSet);
        Integer first = ascIntegerTreeSet.first();
        System.out.println("first element of ascIntegerTreeSet: "+first);

        Integer last = ascIntegerTreeSet.last();
        System.out.println("the last (highest) element currently in ascIntegerTreeSet is : "+last);


        SortedSet<Integer> headSet = ascIntegerTreeSet.headSet(43);
        System.out.println("headSet of ascIntegerTreeSet: "+headSet);

        NavigableSet<Integer> headSet1 = ascIntegerTreeSet.headSet(43, true);
        System.out.println("headSet(inclusive=true) of ascIntegerTreeSet: "+headSet1);

        Integer higher = ascIntegerTreeSet.higher(23);
        Integer higher1 = ascIntegerTreeSet.higher(last);
        System.out.format("the least element in this set strictly > %s is %s , > %s is %s %n",23,higher,last,higher1);

        Integer lower = ascIntegerTreeSet.lower(23);
        Integer lower1 = ascIntegerTreeSet.lower(first);
        System.out.format("the greatest element in this set strictly < %s is %s , < %s is %s %n",23,lower,first,lower1);

        Integer pollFirst = ascIntegerTreeSet.pollFirst();
        System.out.println("pollFirst = " + pollFirst + " ,then ascIntegerTreeSet = " + ascIntegerTreeSet);

        Integer pollLast = ascIntegerTreeSet.pollLast();
        System.out.println("pollLast = " + pollLast + " ,then ascIntegerTreeSet = " + ascIntegerTreeSet);


        //treeSet.add(null) throw NullPointerException
        // if the specified element is null and this set uses natural ordering
        // ,or its comparator does not permit null elements
        TreeSet<Integer> allowNullTreeSet = new TreeSet<>(
                (num1, num2) -> {
                    return ascNullMax(num1, num2);
                }
        );
        allowNullTreeSet.addAll(Arrays.asList(1,3,2,45,23,14,9,null,0));
        System.out.println("allowNullTreeSet = " + allowNullTreeSet);


    }

    /** 生序,null最小*/
    private static int ascNullMin(Integer num1, Integer num2) {
        if (num1 == null)
            return -1;
        if (num2 == null) {
            return 1;
        }
        return num1.compareTo(num2);
    }
    /** 生序,null最大*/
    private static int ascNullMax(Integer num1, Integer num2) {
        if (num1 == null)
            return 1;
        if (num2 == null) {
            return -1;
        }
        return num1.compareTo(num2);
    }
}
