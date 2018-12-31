package com.collection;

import java.util.PriorityQueue;

public class PriorityQueueDemo {

	
	public static void main(String[] args) {
		
		PriorityQueue<String> priorityQueue = new PriorityQueue<>();
		
		
		priorityQueue.offer("a");
		priorityQueue.offer("c");
		priorityQueue.offer("z");
		priorityQueue.offer("f");
		priorityQueue.offer("x");
		
		System.out.println(priorityQueue);
		
		
		PriorityQueue< String> priorityQueue2 = new PriorityQueue<>(new MyQueueComparator());
		priorityQueue2.offer("a");
		priorityQueue2.offer("c");
		priorityQueue2.offer("z");
		priorityQueue2.offer("f");
		priorityQueue2.offer("x");
		
		System.out.println(priorityQueue2);
	}
}
