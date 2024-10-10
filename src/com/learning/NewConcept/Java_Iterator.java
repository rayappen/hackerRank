package com.learning.NewConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Java_Iterator {
	
	public static void main(String[] args) {
		
		List<Integer> array = new ArrayList<>(Arrays.asList(1, 3, 4, 5, 6));
		
		Iterator<Integer> it = array.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
