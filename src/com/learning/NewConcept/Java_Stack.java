package com.learning.NewConcept;

import java.util.Stack;

public class Java_Stack {

	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<>();
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		
		int counter = 0;
//		while(!stack.isEmpty())
//		{
//			System.out.println(stack.pop());
//			System.out.println("Stack: " + stack);
//		}
		
		System.out.println(stack.peek());
	}
	
}
