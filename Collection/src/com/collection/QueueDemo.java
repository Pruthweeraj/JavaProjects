package com.collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		Queue< Integer> queue = new PriorityQueue<>();
		
		
		System.out.println(queue.peek());//null
		//System.out.println(queue.remove());//NoSechElementException

		for (int i = 0 ; i <10 ; i++  ){
			queue.offer(i);//adding Objects to the queue
		}
		
		//Object poll()
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue); 
		
		//Object remove()
		System.out.println(queue.remove());
		System.out.println(queue);
		
	}
}
