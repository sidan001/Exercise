package com.exercise.collections.set_interface;


import java.util.*;
import java.util.stream.Collectors;

public class SetDemo {
    public static void main(String[] args) {
        List<String> list = list = Arrays.asList("cat", "dog", "dog","ant", "ant", "bird", "cat");

//        Collection<String> noDups = new HashSet<String>(list);  // no duplicates
        Set<String> noDups = list.stream().collect(Collectors.toSet()); // no duplicates

        String collect = noDups.stream().collect(Collectors.joining(","));
        System.out.println(collect);//a,b,c

        list = new ArrayList<>(noDups);
        collect = list.stream().collect(Collectors.joining(","));
        System.out.println(collect);

    }

    public static <E> Set<E> removeDups(Collection<E> c) {
        return new LinkedHashSet<E>(c);
    }
}
