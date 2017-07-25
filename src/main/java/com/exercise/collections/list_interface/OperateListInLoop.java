package com.exercise.collections.list_interface;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;

public class OperateListInLoop {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>(Arrays.asList("a","b","c","d"));
        for(int i=0;i<list.size();i++){
            list.remove(i);
        }
        System.out.println(list);// [b, d]

        ArrayList<String> list1 = new ArrayList<String>(Arrays.asList("a","b","c","d"));
        for(String s:list1){   //java.util.ConcurrentModificationException
            if(s.equals("a")){
                list1.remove(s);
            }
        }

        ArrayList<String> list2 = new ArrayList<String>(Arrays.asList("a", "b", "c", "d"));
        for (ListIterator<String> lit = list2.listIterator(); lit.hasNext();) {
            if (lit.next().equals("a")) lit.remove();
        }
        System.out.println(list2);


        for (Iterator<String> iterator = list2.iterator();iterator.hasNext();){
            if (iterator.next().equals("b")) iterator.remove();
        }
        System.out.println(list2);



    }





}
