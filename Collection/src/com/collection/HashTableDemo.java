package com.collection;

import java.util.Hashtable;

public class HashTableDemo {

	public static void main(String[] args) {
		Hashtable<Object , String> hashtable = new Hashtable<>();
		hashtable.put(new temp (5), "A");
		hashtable.put(new temp(2), "B");
		hashtable.put(new temp(6), "C");
		hashtable.put(new temp(15), "D");
		hashtable.put(new temp(23), "E");
		hashtable.put(new temp(16), "F");
		
		//hashtable.put(11, null);//NLP
		
		System.out.println(hashtable);
		
	}
	
}
