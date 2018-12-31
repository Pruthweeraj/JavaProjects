package com.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;



public class CollectionDemo {

	public static void main(String[] args) {
		
		
		Collection<String> collection = new ArrayList<String>();
		Collection<String> collection2 = new ArrayList<String>();
		
		//adding individual objects  to a collection
		collection.add("pruthwee");
		collection.add("Jogi");
		collection.add("Akash");
		collection.add("puja");
		collection.add("Sri");
		collection.add("mathana");
		
		collection2.add("pr");
		collection2.add("ss");
		
		System.out.println("collection::::::"+collection);
		System.out.println("collectyion2:::::::::"+collection2);
		
		//adding a collection to the existing collection 
		collection.addAll(collection2);
		System.out.println(collection);
		
		//boolean isEmpty()
		System.out.println(collection2.isEmpty());
		//clearing the collection2
		collection2.clear();
		System.out.println(collection2.isEmpty());
		
		//boolean contains(Object o)
		System.out.println(collection.contains("Jogi"));
		
		//boolean containsAll(Colection<> c)
		collection.addAll(collection2);
		System.out.println(collection.containsAll(collection2));
		
		
		//boolean equals(Object o)
		System.out.println(collection.equals(collection2));
		
		collection2.clear();
		collection2.addAll(collection);
		System.out.println(collection.equals(collection2));
		
		
		//int hashCode()
		System.out.println(collection.hashCode());
		System.out.println(collection2.hashCode());
		
		collection2.clear();
		System.out.println(collection.hashCode());
		System.out.println(collection2.hashCode());
		
		//Iterator<E> iterator()
		Iterator<String> iterator = collection.iterator();
		 while(iterator.hasNext()){
			 System.out.println(iterator.next());
		 }
		
		 
		 //boolean remove(Object o)
		 System.out.println(collection);
		 collection.remove("ss");
		 System.out.println(collection);
		
		//boolean removeAll(Collection<> c)
		 collection2.add("pr");
		 collection2.add("Jogi");
		 collection.removeAll(collection2);
		 System.out.println(collection);
		 
		 
		//boolean retainAll(Collection <> c)
		 collection.addAll(collection2);
		 Collection<String> temp = new ArrayList<>();
		  temp.addAll(collection);
		  System.out.println(temp);
		 
		  collection.retainAll(collection2);
		 System.out.println(collection);
		 
		 collection = temp;
		 System.out.println(collection);
		temp = null; 
		
		//int size()
		System.out.println(collection.size());
		
		//Object[]  toArray()
		Object[] myArray = collection.toArray();
		
		for (Object object:myArray){
			System.out.print("\t"+object);
		}
		
		
		
		//<T> T[]	toArray(T[] a)
		Object[] myArray2 = collection.toArray(new Object[10]);
		System.out.println();
		for (Object object:myArray2){
			System.out.print("\t"+object);
		}
		
		
	}
}
