package com.learning.NewConcept;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

public class Java_Dequeue {

	public static void main(String[] args) {

		 Scanner in = new Scanner(System.in);
	        
//	        int n = in.nextInt();
//	        int m = in.nextInt();
//	        
//	        int[] array = new int[n];
//	        for (int i = 0; i < n; i++) {
//	            array[i] = in.nextInt();
//	        }
	        
	        int n = 6;
	        int m = 3;
	        
	        int[] array = {5, 3, 5, 2, 3, 2};
	        
	        // Using a HashMap to count occurrences of elements in the current window
	        Map<Integer, Integer> countMap = new HashMap<>();
	        Deque<Integer> deque = new LinkedList<>();
	        int maxUniqueCount = 0;
	        
	        for (int i = 0; i < n; i++) {
	            // Add current element to the deque and map
	            deque.offerLast(array[i]);
	            countMap.put(array[i], countMap.getOrDefault(array[i], 0) + 1);
	            
	            // If the window exceeds size M, remove the leftmost element
	            if (deque.size() > m) {
	                int removedElement = deque.pollFirst();
	                countMap.put(removedElement, countMap.get(removedElement) - 1);
	                
	                // If count drops to 0, remove it from the map
	                if (countMap.get(removedElement) == 0) {
	                    countMap.remove(removedElement);
	                }
	            }
	            
	            // Once we have a full window, check the unique count
	            if (deque.size() == m) {
	                maxUniqueCount = Math.max(maxUniqueCount, countMap.size());
	            }
	        }
	        
//	        System.out.println(maxUniqueCount);
	        in.close();	        
	        System.out.println(countMap);

	}

}
