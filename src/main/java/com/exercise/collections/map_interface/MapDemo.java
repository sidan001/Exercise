package com.exercise.collections.map_interface;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		HashMap<String,Integer> defaultMap = new HashMap<String,Integer>();
		defaultMap.put("one", 1);
		defaultMap.put("two", 2);
		
		HashMap<String,Integer> override = new HashMap<String,Integer>();
		override.put("three", 3);
		override.put("four", 4);
		
		Map<String,Integer> map = newAttributeMap(defaultMap,override);
		System.out.println(map);
		
		//三种取补集的方式
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		entrySet.removeAll(defaultMap.entrySet());
		System.out.println(map);
		
		map.keySet().removeAll(override.keySet());
		System.out.println(map);
		
		map = newAttributeMap(defaultMap,override);
		map.values().removeAll(Collections.singleton(1));
		System.out.println(map);
		
//		map.values().add(5);
//		map.keySet().add("five");
		
		
		
	}

	/**
	 *@param entrySet  
	 * 
	*/
	private static void printEntrySet(Set<Map.Entry<String, Integer>> entrySet) {
		System.out.println("--------------------------------");
		for(Map.Entry<String,Integer> entry : entrySet){
			//可以更改值：entry.setValue(1);
			
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("key: "+key+", value:"+ value);
		}
		System.out.println("--------------------------------");
	}

	static <K, V> Map<K, V> newAttributeMap(Map<K, V> defaults,
			Map<K, V> overrides) {
		Map<K, V> result = new HashMap<K, V>(defaults);
		result.putAll(overrides);
		return result;
	}
}
