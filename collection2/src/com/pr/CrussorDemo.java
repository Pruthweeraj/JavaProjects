package com.pr;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Vector;

public class CrussorDemo {
	public static void main(String[] args) {
		Collection<Number> collection = new ArrayList<>();
		
		collection.add(14);
		collection.add(144);
		collection.add(2493);
		collection.add(254);
		collection.add(14);
		collection.add(1);
		collection.add(142);
		
		System.out.println(collection);
		
		//use of Enumeration(I) 
		Vector<Number> vector = new Vector<>(collection);
		Enumeration<Number> enumeration = vector.elements();
		while(enumeration.hasMoreElements()) {
			System.out.println(enumeration.nextElement());
		}
		
		
		
		//use of Iterator (I)
		
		SortedSet<Number> sortedSet = new TreeSet<>(collection);
		Iterator<Number> iterator = sortedSet.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
			
			iterator.remove();
			
		}
		System.out.println(sortedSet);
	    
		
		//use of ListIterator
		Collection<String> collection2 = new ArrayList<>();
		collection2.add("balakrishna");
		collection2.add("vinki");
		collection2.add("chiru");
		collection2.add("nag");
		
		System.out.println(collection);
		List<String> list = new ArrayList<>(collection2);
		System.out.println(list);
		ListIterator<String> listIterator = list.listIterator();
		while (listIterator.hasNext())
		{
			String s = listIterator.next();
			if(s.equals("vinki")) {
				listIterator.remove();
			}
			else if (s.equals("nag")) {
				listIterator.add("chaitu");
			}
			else if(s.equals("chiru")) {
				listIterator.set("charan");
			}
			
		}
		System.out.println(list);
	}

}
