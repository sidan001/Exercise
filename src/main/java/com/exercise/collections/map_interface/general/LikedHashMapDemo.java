package com.exercise.collections.map_interface.general;

import java.util.LinkedHashMap;

/**
 * @create 2018-09-14 11:40
 */
public class LikedHashMapDemo {
    public static void main(String[] args) {
        final LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();

        linkedHashMap.put("1", 1);
        linkedHashMap.put("xx", 99);
        linkedHashMap.put("1", 2);


        linkedHashMap.keySet().forEach(System.out::println);
        System.out.println(linkedHashMap);
    }
}
