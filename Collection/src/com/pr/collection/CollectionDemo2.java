package com.pr.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo2 {
public static void main(String[] args) {
		
		//*****Collection (I) methods*************//
		
		//creating a collection object
		Collection<Object> c = new ArrayList<Object>();
		
		//creating  collection object object c2
		Collection<Object> c2 = new ArrayList<Object>();
		
		
		c.add(10);
		c.add("pr");
		c.add("12.01");
		c.add(50L);
		
		System.out.println("collection:::::::"+c);
		
		c2.add(24.235f);
		
		//Adding the arrayList collection to al
		c2.addAll(c);

		System.out.println("collection2::::::::::::"+c2);
		
		//clearing the arrayList collection
		c.clear();
		System.out.println("collection:::::::"+c);
		
		//checking for a object is present or not in c2 
		System.out.println(c2.contains("pr"));
		
		c.add(14);
		c.add("java");
		
		c2.addAll(c);
		System.out.println(c2);
		
		System.out.println(c2.containsAll(c));
		
		System.out.println(c2.size());
		
		//converting ArrayList to array 
		Object[] objArr= c2.toArray();
		
		for (Object object : objArr) {
			System.out.print("\t"+object);
		}
		
		
		//using iterator in collection
		Iterator<Object> iterator = c2.iterator() ;
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		
}
}
