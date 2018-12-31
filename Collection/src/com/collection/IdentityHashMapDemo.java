package com.collection;

import java.util.IdentityHashMap;

public class IdentityHashMapDemo {

	public static void main(String[] args) {
		   
		IdentityHashMap<Number , String> identityHashMap = new IdentityHashMap<>(); //same as HashMap but it checks the key according the == (used for reference compression )
		Integer n1 = new Integer(10);
		Integer n2 = new Integer(10);
		identityHashMap.put(n1, "Pruthwee");
		identityHashMap.put(n2, "Jogi");
		
		System.out.println(identityHashMap);
		
		
		
	}
}
