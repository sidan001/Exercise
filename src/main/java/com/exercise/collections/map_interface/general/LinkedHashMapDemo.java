package com.exercise.collections.map_interface.general;

import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * Created by chou on 2020/3/13.
 */
public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<String, String>(6, 0.75f, true);

        linkedHashMap.put("A", "a");
        linkedHashMap.put("Z", "z");
        linkedHashMap.put("D", "d");
        linkedHashMap.put("A", "aa");

        System.out.println(linkedHashMap);


        new LinkedHashMapDemo().testHashMapCopy();



    }

    private  void testHashMapCopy() {

        HashMap<String, Ball> ballHashMap = new HashMap<>(3);
        ballHashMap.put("a", new Ball("aaa"));
        ballHashMap.put("b", new Ball("bbb"));
        ballHashMap.put("c", new Ball("ccc"));

        System.out.printf("ballHashMap: %s%n", ballHashMap);

        LinkedHashMap<String, Ball> ballLinkedHashMap = new LinkedHashMap<>(ballHashMap);
        System.out.printf("before chagne ballHashMap, ballLinkedHashMap: %s%n", ballLinkedHashMap);

        ballHashMap.get("a").setColor("AAAAAA");
        ballHashMap.get("c").setColor("DDDDDD");

        //更改ballHashMap重的value， linkedHashMap中的value也会变
        System.out.printf("after chagne ballHashMap,  ballLinkedHashMap: %s%n", ballLinkedHashMap);


        ballHashMap.put("0", new Ball("ddd"));
        ballHashMap.put("1", new Ball("eee"));

        System.out.printf("after put key-value into ballHashMap,  ballHashMap: %s%n", ballHashMap);
        System.out.printf("after put key-value into ballHashMap,  ballLinkedHashMap: %s%n", ballLinkedHashMap);




    }


    class Ball{
        public String color;

        public Ball(String color) {
            this.color = color;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        @Override
        public String toString() {
            return "Ball{" +
                    "color='" + color + '\'' +
                    '}';
        }
    }
}
