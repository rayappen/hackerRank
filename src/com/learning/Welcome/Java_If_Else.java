package com.learning.Welcome;

import java.util.Scanner;

public class Java_If_Else {
	
	
	/*
	Given an integer, , perform the following conditional actions:

		If  is odd, print Weird
		If  is even and in the inclusive range of 2 to 5, print Not Weird
		If  is even and in the inclusive range of 6 to 20, print Weird
		If  is even and greater than 20, print Not Weird
		Complete the stub code provided in your editor to print whether or not  is weird.

		Input Format

		A single line containing a positive integer, .

		Constraints

		Output Format

		Print Weird if the number is weird; otherwise, print Not Weird.

		Sample Input 0

		3
		Sample Output 0

		Weird
		
		*/

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		if(N % 2 == 0)
		{
			if(N <= 5 && N >= 2)
			{
				System.out.println("Not Weird");
			}
			else if(N <= 20 && N >= 6)
			{
				System.out.println("Weird");
			}
			else if(N > 20)
			{
				System.out.println("Not Weird");
			}
		}
		else
		{
			System.out.println("Weird");
		}
		
		sc.close();
	}
	
}
