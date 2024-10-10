package com.learning.ExceptionHandling;

import java.util.Scanner;

public class Java_Exception_Handling_I {

	public static void main(String[] args) {

		try {
			Scanner sc = new Scanner(System.in);

			int x = sc.nextInt();
			int y = sc.nextInt();
			sc.close();
			
			System.out.println(x/y);
			
		} 
		catch (ArithmeticException e)
		{
			System.out.println(e.getClass().getName() + ": " + e.getMessage());
		}
		
		catch (Exception e) {
			
			System.out.println(e.getClass().getName());
		}

	}

}
