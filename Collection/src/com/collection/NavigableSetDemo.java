package com.collection;

import java.util.TreeSet;
import java.util.NavigableSet;
public class NavigableSetDemo {
	
	public static void main(String[] args) {
		
		NavigableSet<Number> navigableSet = new TreeSet<>();
		
		navigableSet.add(142);
		navigableSet.add(14);
		navigableSet.add(465);
		navigableSet.add(41);
		navigableSet.add(476);
		navigableSet.add(44);
		navigableSet.add(22);
		navigableSet.add(44);
		navigableSet.add(10);
		navigableSet.add(447);
		
		System.out.println(navigableSet);
		
		System.out.println(navigableSet.floor(22));//higest <= element 
		System.out.println(navigableSet.floor(444));
		System.out.println(navigableSet.floor(470));
		
		System.out.println(navigableSet.lower(22));//higest < element 
		System.out.println(navigableSet.lower(465));
		System.out.println(navigableSet.lower(446));
		
		System.out.println(navigableSet.ceiling(22));//lowest >= element 
		System.out.println(navigableSet.ceiling(444));
		System.out.println(navigableSet.ceiling(470));
		
		System.out.println(navigableSet.higher(22));//lowest > element 
		System.out.println(navigableSet.higher(444));
		System.out.println(navigableSet.higher(470));
		
		NavigableSet<Integer> navigableSet2 = new TreeSet<>();
		navigableSet2.add(2);
		navigableSet2.add(4);
		navigableSet2.add(6);
		navigableSet2.add(8);
		navigableSet2.add(10);
		System.out.println(navigableSet2);
		System.out.println(navigableSet2.floor(6));
		System.out.println(navigableSet2.lower(6));
		System.out.println(navigableSet2.ceiling(6));
		System.out.println(navigableSet2.higher(6));
		
		
		
		System.out.println(navigableSet2.pollFirst()); //pool first object and remove and return that
		System.out.println(navigableSet2);
		System.out.println(navigableSet2.pollLast());//pool last object and remove and return that
		System.out.println(navigableSet2);
		
		System.out.println(navigableSet2.descendingSet());//give an object by arrange the navigableSet in descending order, but the navigableSet remains same
		System.out.println(navigableSet2);
	}

}
