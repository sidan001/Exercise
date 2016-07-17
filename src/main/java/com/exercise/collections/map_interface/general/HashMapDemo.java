package com.exercise.collections.map_interface.general;


import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String,Integer> defaultMap = new HashMap<String,Integer>();
        defaultMap.put("one", 1);
        defaultMap.put(null,null);
        System.out.println("defaultMap = " + defaultMap);
    }
}
