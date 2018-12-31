package com.collection;


import java.io.ObjectOutputStream.PutField;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap();
		
		//Object put(Object o)
		map.put(11, "Pr Panda");
		map.put(14, "Jagu");
		map.put(13, "Pinkey");
		map.put(1,"Pinkey");
		map.put(111, "kajal");
		map.put(3, "Mas");
		map.put(81,"Pinkey");
		
		
		//void putAll(Map m)
		Map<Integer ,String> map2 = new HashMap<>();
		map2.put(15,"durga");
		map2.put(111, "kalia");
		map2.put(3, "Max");
		map.putAll(map2);
		System.out.println(map);
		
		
		
		//Object get(Object key)
		System.out.println(map.get(3));
		System.out.println(map.get(22));
		
		//Object getOrDefault(Object key , object value)
		System.out.println(map.getOrDefault(199, "Not Found"));
		
		//Object remove(Object key)
		System.out.println(map.remove(111));//removing kajal
		
		
		//boolean ContainsKey(Object key)
		System.out.println(map.containsKey(11));
		System.out.println(map.containsKey(1144));
		
		//boolean ContainsValue(Object value)
		System.out.println(map.containsValue("pr"));
		System.out.println(map.containsValue("Max"));
		
		//boolean isEmpty()
		System.out.println(map.isEmpty());
		
		
		//int size()
		 System.out.println(map.size());
		 
		 //Set keySet
		 Set s =map.keySet();
		 System.out.println(s);
		 
		 //Collection values()
		 Collection collection = map.values();
		 System.out.println(collection);
		 
		 //Set entrySet()
		 Set set = map.entrySet();
		 System.out.println(set);
		 
		 
		 
		 
		 
	}
	
	
}
