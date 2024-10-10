package com.learning.String;

import java.util.Scanner;

public class Java_Substring_Comparisions {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
        String s = in.next();
        int k = in.nextInt();
        in.close();
		
		String smallest = s.substring(0, k);
		String largest = "";
		String currentValue = "";
		int indexCounter = 0;
		
		while(indexCounter < s.length())
		{
			
			if(indexCounter + k > s.length()) {
				break;
			}
			
			currentValue = s.substring(indexCounter, indexCounter + k);
			
			if(smallest.compareTo(currentValue) > currentValue.compareTo(smallest))
			{
				smallest = currentValue;
			}
			
			if(largest.compareTo(currentValue) < currentValue.compareTo(largest))
			{
				largest = currentValue;
			}
			
			indexCounter++;
		}
		
		System.out.printf("The lowest: %s and highest: %s", smallest, largest);
	}

	
	/*lexicography for single characters*/
	/*
	 * int indexCounter = 0;
		char lowestValue = str.charAt(0);
		char HighestValue = str.charAt(str.length() - 1);
		
		while(indexCounter < str.length())
		{
			
			if(str.charAt(indexCounter) < lowestValue)
			{
				lowestValue = str.charAt(indexCounter);
			}
			
			if(str.charAt(indexCounter) > HighestValue)
			{
				HighestValue = str.charAt(indexCounter);
			}
			
			indexCounter++;
		}
		
		System.out.printf("The lowest: %c and highest: %c", lowestValue, HighestValue);
	}
	 */
}
