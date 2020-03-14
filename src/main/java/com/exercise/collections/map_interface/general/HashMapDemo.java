package com.exercise.collections.map_interface.general;


import java.util.HashMap;

public class HashMapDemo {

    public static void main(String[] args) {

        HashMap<String,Integer> defaultMap = new HashMap<String,Integer>();

        System.out.println("hello world ");
        defaultMap.put("one", 1);
        defaultMap.put("two", null);
        defaultMap.put(null,null);
        System.out.println("defaultMap = " + defaultMap);


        System.out.println(HashMapDemo.tableSizeFor(3));

    }


    /**
     * The maximum capacity, used if a higher value is implicitly specified
     * by either of the constructors with arguments.
     * MUST be a power of two <= 1<<30.
     */
    static final int MAXIMUM_CAPACITY = 1 << 30;

    /**
     * Returns a power of two size for the given target capacity.
     */
    static final int tableSizeFor(int cap) {
        int n = cap - 1;
        n |= n >>> 1;
        n |= n >>> 2;
        n |= n >>> 4;
        n |= n >>> 8;
        n |= n >>> 16;
        return (n < 0) ? 1 : (n >= MAXIMUM_CAPACITY) ? MAXIMUM_CAPACITY : n + 1;
    }
}
