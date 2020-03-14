package com.exercise.collections.map_interface;

import java.util.*;

/**
 * Created by chou on 2018/12/28.
 */
public class TestMap {
    public static void main(String[] args) {
        Map<Integer, String> idName = new HashMap<>();
        idName.put(1, "张三");
        idName.put(2,"llisi");
        Map<Integer, Integer> idAge = new HashMap<>();
        idAge.put(1, 12);
        idAge.put(2, 22);


        //1 , 张三， 12
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i<list.size(); i++){
        }
        for (Integer integer : list) {

        }

        Set<Map.Entry<Integer, String>> entries = idName.entrySet();
        for ( Map.Entry<Integer, String> idEntry: entries){
            Set<Map.Entry<Integer, Integer>> idAgeEntries = idAge.entrySet();
            for (Map.Entry<Integer, Integer> ageEntries :idAgeEntries ){
                if (idEntry.getKey().equals(ageEntries.getKey())){
                    System.out.println(idEntry.getKey()+idEntry.getValue()+ageEntries.getValue());
                }
            }


        }










    }

























    private static void twoSecond(Map<Integer, String> idName) {
        Iterator<Map.Entry<Integer, String>> iterator = idName.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, String> next = iterator.next();

        }
    }

    private static void oneMethod(Map<Integer, String> idName, Map<Integer, Integer> idAge) {
        for (Map.Entry<Integer, String> idNameEntry : idName.entrySet()) {
            for (Map.Entry<Integer, Integer> idAgeEntry : idAge.entrySet()) {
                if (idNameEntry.getKey().equals(idNameEntry.getKey())) {
                    System.out.println(idNameEntry.getKey() + idNameEntry.getValue() + idAgeEntry.getValue());
                }
            }


        }
    }
}
