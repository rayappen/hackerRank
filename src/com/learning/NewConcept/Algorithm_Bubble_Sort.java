package com.learning.NewConcept;

public class Algorithm_Bubble_Sort {

	private static int[] integer_bubble_sort(int[] array, boolean ascending)
	{
		
		for(int i = 0; i < array.length; i++)
		{
			for(int j = 0; j < array.length - i - 1; j++)
			{
				
				if(array[j] > array[j+1])
				{
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
				
			}
		}
		
		return array;
	}

	public static void main(String[] args) {

		int[] array = {102, 1, 0, 98};
		
		array = integer_bubble_sort(array, true);
		
		for(int i = 0; i < array.length; i++) {
			System.out.printf("Array Element Postion: %d Value: %d\n", i, array[i]);
		}
	}

}
