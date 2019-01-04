package com.pr;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
	public static void main(String[] args) {
		

	LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
	
	linkedHashSet.add("pr and pp");
	linkedHashSet.add("pr and pp");//Duplicates are not allowed
	linkedHashSet.add("pupa");
	linkedHashSet.add("pruthwee");
	linkedHashSet.add("apple");// insertion order should be preserved
	linkedHashSet.add(null);//null insertion is possible
	linkedHashSet.add(null);//Duplicates are not allowed
	
	System.out.println(linkedHashSet);
 
		
	}

}
