package com.collection;

public class ComparableDemo {

	public static void main(String[] args) {
		
		System.out.println("A".compareTo("x"));//-ve
		System.out.println("a".compareTo("b"));//-ve
		System.out.println("c".compareTo("a"));//+ve
		System.out.println("m".compareTo("m"));//0
	}
}
