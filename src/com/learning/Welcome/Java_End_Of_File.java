package com.learning.Welcome;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Java_End_Of_File {
	
	public static void main(String[] args) throws FileNotFoundException {
		
	       Scanner sc = new Scanner(System.in);
	       int counter = 1;
	        
	        while(sc.hasNext())
	        {
	            System.out.printf("%d %s\n", counter, sc.nextLine());
	            counter++;
	        }
	        
	        sc.close();
	    }
	
}
