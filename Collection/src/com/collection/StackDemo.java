package com.collection;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<>();
		
		//Object push(Object o)
		stack.push(11);
		stack.push(12);
		stack.push(13);
		stack.push(14);
		System.out.println(stack.push(15));	
		System.out.println(stack);
		
		//Object pup()
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack);
		
		
		
		//object peek()
		System.out.println(stack.peek());
		System.out.println(stack.peek());
		System.out.println(stack);
		
		//boolean empty()
		System.out.println(stack.empty());
		System.out.println(stack);
		
		//int index    search(Object o)
		System.out.println(stack.search(12));
		
		
	}
	
}
