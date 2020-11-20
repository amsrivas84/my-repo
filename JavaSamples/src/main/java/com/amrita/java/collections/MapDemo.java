package com.amrita.java.collections;

import java.util.*;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Maps
		// HashMap
		// Map<String, Integer> ageMap = new Hashtable<String, Integer>(); HashMap n
		// HashTable similar
		Map<String, Integer> ageMap = new HashMap<>();
		// ageMap.put("Tejas", 38);
		ageMap.put("Aarna", 2);
		ageMap.put("Amrita", 36);
		ageMap.put("Tejas", 40);
		ageMap.put("Msdnsd", 37);
		System.out.println(ageMap.get("Tejas"));
		System.out.println(ageMap);

		// Ways of printing key value pair in hashmap
		// Step 1
		Set<String> s = ageMap.keySet();
		for (String i : s)
			System.out.println("Key: " + i + " Value: " + ageMap.get(i));

		//Step 2
		Set<Map.Entry<String, Integer>> me= ageMap.entrySet();
		System.out.println("Printing data using entry inetrface inside Map interface");
		for(Map.Entry<String, Integer> i : me) {
			System.out.println("Key: " + i.getKey() + " Value: " + i.getValue());
		}
		
		
		Map<String, Integer> treeMap = new TreeMap<String, Integer>();
		treeMap.put("Mzzzz", 37);
		treeMap.put("Aarna", 2);
		treeMap.put("Amrita", 36);
		treeMap.put("Tejas", 40);
		treeMap.put("Carbon", 37);
		System.out.println(treeMap);

		// NavigableSet interface
		// Two classes implement them - TreeSet and TreeMap

		TreeMap<String, Integer> treeMap1 = new TreeMap<String, Integer>();
		treeMap1.put("Mzzzz", 37);
		treeMap1.put("Aarna", 2);

		System.out.println(treeMap1.lowerKey("Mzzzz"));
		System.out.println(treeMap1.floorKey("Mzzzz"));
		System.out.println(treeMap1.higherKey("Mzzzz"));
		System.out.println(treeMap1.ceilingKey("Mzzzz"));

		// NavigableSet interface
		// Two classes implement them - TreeSet and TreeMap

		TreeMap<String, Integer> treeMapOrig = new TreeMap<String, Integer>();
		treeMapOrig.put("Mzzzz", 37);
		treeMapOrig.put("Aarna", 2);
		treeMapOrig.put("Amrita", 36);
		treeMapOrig.put("Tejas", 40);
		treeMapOrig.put("Carbon", 37);
		System.out.println(treeMapOrig);
		NavigableMap<String, Integer> treeMapDesc = treeMapOrig.descendingMap();
		System.out.println(treeMapDesc);
		System.out.println(treeMapOrig.pollFirstEntry());
		System.out.println(treeMapOrig);
		System.out.println(treeMapOrig.pollLastEntry());
		System.out.println(treeMapOrig);

		treeMapOrig.put("Aarna", 2);
		treeMapOrig.put("Tejas", 40);

		// SortedMap<String,Integer> subMap=treeMapOrig.subMap("Aarna", "Carbon");
		SortedMap<String, Integer> subMap = treeMapOrig.subMap("Aarna", true, "Carbon", true);
		System.out.println(subMap);

		// SortedMap<String,Integer> headMap = treeMapOrig.headMap("Tejas");
		SortedMap<String, Integer> headMap = treeMapOrig.headMap("Carbon", true);
		System.out.println(headMap);

		// SortedMap<String, Integer> tailMap = treeMapOrig.tailMap("Amrita");
		SortedMap<String, Integer> tailMap = treeMapOrig.tailMap("Amrita", false);
		System.out.println(tailMap);
	}

}
