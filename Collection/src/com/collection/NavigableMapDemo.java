package com.collection;

import java.util.NavigableMap;
import java.util.TreeMap;

class NavigableMapDemo{
	
	public static void main(String[] args) {
		
		NavigableMap<String, String> navigableMap = new TreeMap<>(); 
		
		navigableMap.put("c", "chandu");
		navigableMap.put("p", "akash");
		navigableMap.put("a","pruthwee");
		navigableMap.put("n", "sagar");
		navigableMap.put("x","manu" );	
		    
		System.out.println(navigableMap);
		
		System.out.println(navigableMap.floorKey("o"));
		System.out.println(navigableMap.floorEntry("o"));

		System.out.println(navigableMap.lowerKey("n"));
		System.out.println(navigableMap.lowerEntry("n"));
		
		System.out.println(navigableMap.ceilingKey("o"));
		System.out.println(navigableMap.ceilingEntry("o"));
		
		System.out.println(navigableMap.higherKey("o"));
		System.out.println(navigableMap.higherEntry("o"));
		
		System.out.println(navigableMap.descendingKeySet());
		
		System.out.println(navigableMap.firstEntry());
		
		System.out.println(navigableMap.descendingMap());
		
		System.out.println(navigableMap.pollFirstEntry());
		System.out.println(navigableMap);
		
		System.out.println(navigableMap.subMap("a", "p"));
		
		System.out.println(navigableMap.tailMap("o"));
		
	}
}