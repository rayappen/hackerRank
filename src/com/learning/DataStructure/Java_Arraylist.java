package com.learning.DataStructure;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Java_Arraylist {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int integerLimit = sc.nextInt();
		int queryLimit;
		int count;
		
		ArrayList<List<Integer>> integerStorage = new ArrayList<>();
		ArrayList<List<Integer>> queryStorage = new ArrayList<>();
		
//		Get Input for Storing integer Value
		for(int i = 0; i < integerLimit; i++)
		{
			count = sc.nextInt();
			List<Integer> tempList = new ArrayList<>();
			
			for(int j = 0; j < count; j++)
			{
				tempList.add(sc.nextInt());
				
			}
			integerStorage.add(tempList);
		}
		
//		Get Input for Storing query Value
		queryLimit = sc.nextInt();
		
		for(int i = 0; i < queryLimit; i++)
		{
			List<Integer> tempList = new ArrayList<>();
			
			for(int j = 0; j < 2; j++)
			{
				tempList.add(sc.nextInt());
				
			}
			queryStorage.add(tempList);
		}
		
//		Closing resource
		sc.close();
		
//		Searching for values using query input
		for(int i = 0; i < queryStorage.size(); i++)
		{
			int xIndex;
			int yIndex;
			
			try {
				 xIndex = queryStorage.get(i).get(0) - 1;
				 yIndex = queryStorage.get(i).get(1) - 1;
				 System.out.println(integerStorage.get(xIndex).get(yIndex));
			}
			catch(Exception e)
			{
				System.out.println("ERROR!");
			}

		}
	}

}
