package com.pr.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionDemo {

	public static void main(String[] args) {
		
		//*****Collection (I) methods*************//
		
		//creating a arrayList object
		ArrayList<Object> arrayList = new ArrayList<Object>();
		
		//creating  arrayList object object al
		ArrayList<Object> al = new ArrayList<Object>();
		
		
		arrayList.add(10);
		arrayList.add("pr");
		arrayList.add("12.01");
		arrayList.add(50L);
		
		System.out.println("arrayList:::::::"+arrayList);
		
		al.add(24.235f);
		
		//Adding the arrayList collection to al
		al.addAll(arrayList);

		System.out.println("al::::::::::::"+al);
		
		//clearing the arrayList collection
		arrayList.clear();
		System.out.println("arrayList:::::::"+arrayList);
		
		//checking for a object is present or not in al 
		System.out.println(al.contains("pr"));
		
		arrayList.add(14);
		arrayList.add("java");
		
		al.addAll(arrayList);
		System.out.println(al);
		
		System.out.println(al.containsAll(arrayList));
		
		System.out.println(al.size());
		
		//converting ArrayList to array 
		Object[] objArr= al.toArray();
		
		for (Object object : objArr) {
			System.out.print("\t"+object);
		}
		
		
		//using iterator in collection
		Iterator<Object> iterator = al.iterator() ;
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		
	}
	
}
