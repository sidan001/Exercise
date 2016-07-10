package com.exercise.collections.set_interface;



import java.util.*;
import java.util.stream.Collectors;

public class FindDups2 {
    public static void main(String[] args) {
        Set<String> uniques = new HashSet<String>();
        Set<String> dups    = new HashSet<String>();

        for (String a : args)
            if (!uniques.add(a))
                dups.add(a);

        System.out.printf("uniques: %s%n",uniques.stream().collect(Collectors.joining(" ")));
        System.out.printf("dups: %s%n",dups.stream().collect(Collectors.joining(" ")));
        // Destructive set-difference
        uniques.removeAll(dups);

        System.out.println("Unique words:    " + uniques);
        System.out.println("Duplicate words: " + dups);
    }
}