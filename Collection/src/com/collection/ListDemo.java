package com.collection;


import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListDemo {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		
		list.add("pruthwee");
		list.add("Jogi");
		list.add("Akash");
		list.add("puja");
		list.add("Sri");
		list.add("mathana");
		
		List<String> list2 = new ArrayList<>();
		list2.add("Hi");
		list2.add("Hello");
		list2.add("Hey");
		
		//boolean add(int index , E element)
		list.add(4, "pr");
		System.out.println(list);
		
		//boolean addAll(int index, Collection c)
		list.addAll(1, list2);
		System.out.println(list);
		
		//Object get(int index)
		System.out.println(list.get(1));
		
		//Object remove(int index)
		System.out.println(list.remove(5));
		
		//Object set(int index , Object new )
		list.set(0, "pp");
		list.set(8, "pp");
		System.out.println(list);
		
		//int indexOf(Object o)
		System.out.println(list.indexOf("pp"));
		
		//int lastIndexOf(Object 0)
		System.out.println(list.lastIndexOf("pp"));
		
		//ListIterator listIterator()
		ListIterator<String> listIterator = list.listIterator();
		while(listIterator.hasNext()){
			System.out.println(listIterator.next());
		}
		
		
		
		
		
		
	}
}
