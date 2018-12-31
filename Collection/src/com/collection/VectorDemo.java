package com.collection;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		Vector<Number> vector = new Vector<>();
				
		//void addElement (Object O)		
		vector.addElement(10);
		vector.addElement(20);	
		vector.addElement(30);
		vector.addElement(40);	
		
		System.out.println(vector);
		
		//boolean  removeElement(object o)
		System.out.println(vector.removeElement(10));
		System.out.println(vector);
		
		//object firstElement()
		System.out.println(vector.firstElement());
		
		
		//Object laseElement()
		System.out.println(vector.lastElement());
		
		
		//Object elementAt(int index)
		System.out.println(vector.elementAt(0));
		
		//int size()
		System.out.println(vector.size());
		
		//int capacity
		System.out.println(vector.capacity());
		
		
	}
}
