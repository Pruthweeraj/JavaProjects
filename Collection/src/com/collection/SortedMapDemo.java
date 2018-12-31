package com.collection;

import java.util.TreeMap;

public class SortedMapDemo {

	public static void main(String[] args) {
		
		TreeMap<Integer, String> treeMap = new TreeMap<>();
		
		treeMap.put(14, "hi");
		treeMap.put(1, "Prinka");
		treeMap.put(14, "jogi");
		treeMap.put(111, "Akash");
		
		System.out.println(treeMap);
		
		TreeMap<Integer, String> treeMap2 = new TreeMap<>(new ComparatorTreeMapDemo());
		
		treeMap2.put(14, "hi");
		treeMap2.put(1, "Prinka");
		treeMap2.put(14, "jogi");
		treeMap2.put(111, "Akash");
		
		System.out.println(treeMap2);
		
		
	}
}
