package com.learning.NewConcept;

import java.util.LinkedList;
import java.util.Queue;

public class Java_Queue {
	
	public static void main(String[] args) {
		
		Queue<Integer> queue = new LinkedList<>();
		
		queue.add(10);
		queue.add(0);
		queue.add(20);
		
		System.out.println(queue);
		
	}

}
