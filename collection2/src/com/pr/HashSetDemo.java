package com.pr;

import java.util.HashSet;

public class HashSetDemo {
	public static void main(String[] args) {
		
		HashSet<Number> hashSet = new HashSet<>();
		System.out.println(hashSet.add(100));//true
		System.out.println(hashSet.add(12.14));//true
		System.out.println(hashSet.add(326.56));//true
		System.out.println(hashSet.add(100));//false
		System.out.println(hashSet.add(18));
		
		System.out.println(hashSet);
		System.out.println(hashSet.size());
	
	}
	

}
