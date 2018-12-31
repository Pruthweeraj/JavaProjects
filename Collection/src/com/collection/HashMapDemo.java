package com.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<Integer, String> hashMap = new HashMap<>();
		hashMap.put(11, "Pr Panda");
		hashMap.put(14, "Jagu");
		hashMap.put(13, "Pinkey");
		hashMap.put(1,"Pinkey");
		hashMap.put(111, "kajal");
		hashMap.put(3, "Mas");
		hashMap.put(81,"Pinkey");
		
		
		
		System.out.println(hashMap);//insertion order is not preserved
		System.out.println(hashMap.get(1));
		System.out.println(hashMap.put(13, "pr pr"));
		Set<Integer> key = hashMap.keySet();
		Collection<String> value = hashMap.values();
		Set collectionArray = hashMap.entrySet();
		
		System.out.println(key);
		System.out.println(value);
		System.out.println(collectionArray);
		
		//Iterator<Object> iterator = hashMap.iterator();//we can not use iterator in maps
		
		//just we have to convert that map object to collection and apply that iterator
		Set set = hashMap.entrySet();
		Iterator<Object > iterator = set.iterator();
		while(iterator.hasNext()){
			
			Object obj = iterator.next();
			Entry e = (Map.Entry)obj;
			
			System.out.println(e.getKey());
			System.out.println(e.getValue());
			
		}
	}
	
}
