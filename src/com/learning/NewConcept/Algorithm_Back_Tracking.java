package com.learning.NewConcept;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Algorithm_Back_Tracking {

	public static List<List<Integer>> findSubsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>(); // To store all subsets
        backtrack(result, new ArrayList<>(), nums, 0);
        return result;
    }
	
	public static void backtrack(List<List<Integer>> result, List<Integer> templist, int []array, int start)
	{
	
		System.out.println(templist);
		result.add(new ArrayList<>(templist));
		
		for(int i = start; i < array.length; i++)
		{
			
			templist.add(array[i]);
			backtrack(result, templist, array, i + 1);
			System.out.println("backward flow happening !!");
			templist.remove(templist.size() - 1);
			
		}
		
	}
	
	public static void main(String[] args) {
		
		int []array = {1,2,3,4,5};
		
		
//		List<List<Integer>> list = new ArrayList<>();
//		list.add(new ArrayList<>(Stream.of(1,2,3,4,5).collect(Collectors.toList())));
//		list.add(new ArrayList<>(Stream.of(1,2,3,4,5).collect(Collectors.toList())));
		
//		System.out.println(list);
		
		System.out.println(findSubsets(array));
		
	}
	
}
