package com.learning.DataStructure;

import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Java_Dequeue {
	
	public static void main(String[] args) {
		
        Scanner in = new Scanner(System.in);
        
        Deque<Integer> deque = new LinkedList<>();
        List<Integer> list = new ArrayList<>();
        
        
        int n = in.nextInt();
        int m = in.nextInt();
        
        int counter = 0;
        int right = 0;
        int max = 0;

        int []array = new int[n];
        
        for (int i = 0; i < n; i++) {
            array[i] = in.nextInt();
        }
        
        in.close();
        
        while(right < n)
        {
        	
        	while(deque.size() == m)
        	{
        		deque.pollFirst();
        	}
        	
        	deque.offerLast(array[right]);
        	
        	if(deque.size() == m)
        	{
        		list.add(new HashSet<>(deque).size());
        		
        		if(right == 0)
        		{
        			max = list.get(0);
        		}
        		
        		if(list.get(counter) > max)
        			max = list.get(counter);
        		
        		counter++;
        	}
        	
        	right++;
        }
        
        System.out.println(max);
    }
	
}
