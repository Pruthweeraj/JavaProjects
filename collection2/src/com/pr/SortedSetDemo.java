package com.pr;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo {

	public static void main(String[] args) {
		SortedSet<Number> sortedSet = new TreeSet<>();
		
		sortedSet.add(10);
		sortedSet.add(5);
		sortedSet.add(54);
		sortedSet.add(111);
		sortedSet.add(1);
		
		System.out.println(sortedSet);//insertion order is not preserved , shorted according to some shorting order
		
		//Object first()
		System.out.println(sortedSet.first());
		
		//Object last()
		System.out.println(sortedSet.last());
		
		//Object   headSet(object)
		System.out.println(sortedSet.headSet(10));
		
		//Object tailSet(Number arg0)
		System.out.println(sortedSet.tailSet(10));
		
		//SortedSet<Number>    subSet(Number arg0, Number arg1)
		System.out.println(sortedSet.subSet(5, 111));
		
		//Comparator<? super Number> 	comparator()
		System.out.println(sortedSet.comparator());//null due to using natural sorting order
		
		
	}
}
