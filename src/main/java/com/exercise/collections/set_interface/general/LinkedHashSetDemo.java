/**
* @Description: TODO
 */
package com.exercise.collections.set_interface.general;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        //LinkedHashSet 保持插入顺序 底层实现为LinkedHashMap
        List<Integer> integers = Arrays.asList(1, 2, 39, 6, 43, 6, null,78,null, 90,23, 23);
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>(integers);
        System.out.println("linkedHashSet = " + linkedHashSet);




    }
}
