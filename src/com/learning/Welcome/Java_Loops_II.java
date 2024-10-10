package com.learning.Welcome;

import java.util.Scanner;

public class Java_Loops_II {

	public static void main(String[] argh) {
		
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		int s = 0;
		
		for (int i = 0; i < t; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			int n = in.nextInt();
			
			int counter = 1;
			s = a + (1 * b);
			System.out.print(s + " ");
			
			while(counter < n)
			{
				s += Math.pow(2, counter) * b;
				counter++;
				System.out.print(s + " ");
			}
			
			System.out.println();
		}
		
		in.close();
	}

}
