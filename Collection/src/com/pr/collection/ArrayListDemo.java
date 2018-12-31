package com.pr.collection;

import java.util.ArrayList;

public class ArrayListDemo {

	
	public static void main(String[] args) {
		
		ArrayList<String> arrayList = new ArrayList<>();
		
		//adding objects by index
		arrayList.add(0, "Apple");
		arrayList.add(1, "Cat");
		arrayList.add(2, "pen");
		arrayList.add(3, null);
		
		System.out.println(arrayList);
		System.out.println(arrayList.size());
		
		//
		arrayList.set(2, "milk");
		System.out.println(arrayList.get(2));
		
		//creating a new arrayList object with equivalent object for the given collection arrayList
		ArrayList<String> al = new ArrayList<>(arrayList);
		System.out.println(al);
		
	}
	
	
}
