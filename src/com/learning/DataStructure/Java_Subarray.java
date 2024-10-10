package com.learning.DataStructure;

import java.util.Scanner;

public class Java_Subarray {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
        int limit = scan.nextInt();
       
        int arr[] = new int[limit + 1];
        
        for(int i = 0; i < limit; i++)
        {
        	arr[i] = scan.nextInt();
        }
        scan.close();
		
		int counter = 0;
		int temp;

		for(int i = 0; i < limit; i++)
		{
			for(int j = i; j < limit; j++)
			{
				temp = 0;
				for(int k = i; k <= j; k++)
				{
					temp += arr[k];
//					System.out.print(arr[k] + " ");
				}
//				System.out.println();
				if(temp < 0)
					counter++;
			}
		}
		
		System.out.println(counter);
	}

}
