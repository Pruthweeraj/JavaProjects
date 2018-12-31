package com.collection;

import java.util.TreeSet;

public class ComparatorDemo {

	public static void main(String[] args) {
		TreeSet<Number> treeSet = new TreeSet<>(new MyComoarator());
		treeSet.add(15);
		treeSet.add(51);
		treeSet.add(2145);
		treeSet.add(14);
		treeSet.add(85);
		treeSet.add(11);
		
		System.out.println(treeSet);
	}
	
}
