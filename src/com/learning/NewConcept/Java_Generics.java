package com.learning.NewConcept;

public class Java_Generics {
	
	public static void main(String[] args) {
		
		Integer []array = {1, 2, 3};
		String []str = {"Hello", "World"};
		
		printArray(array);
		printArray(str);
		
	}

	static <T> void printArray(T[] array) {
	    
		for (T element : array) {
	        System.out.println(element);
	    }
	}
	
}
