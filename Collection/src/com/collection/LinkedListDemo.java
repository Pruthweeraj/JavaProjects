package com.collection;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		LinkedList<Float> linkedList = new LinkedList<>();
		
		linkedList.add(14.14f);
		linkedList.add(125.14f);
		linkedList.add(14.222f);
		linkedList.add(1110f);
		
		System.out.println(linkedList);
		
		//void addFirst(Object O)
		linkedList.addFirst(999.99f);
		System.out.println(linkedList);
		
		//void addLast(Object O)
		linkedList.addLast(111.11f);
		System.out.println(linkedList);
	
		//Object getFirst()
		System.out.println(linkedList.getFirst());
		
		//object getLast()
		System.out.println(linkedList.getLast());
		
		//Object removeFirst()
		System.out.println(linkedList.removeFirst());
		
		//object removeLast()
		System.out.println(linkedList.removeLast());
		
		
		System.out.println(linkedList);
		
	}	
	
}
