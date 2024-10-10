package com.learning.String;

import java.util.Scanner;

public class Java_String_Reverse {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
        String A = sc.next();
        char[] backup = A.toCharArray();        
        sc.close();
        
        int counter = 0;
        int breaker = A.length() / 2;
        
        while(counter < breaker)
        {
        	char temp = A.charAt(counter);
        	backup[counter] = A.charAt((A.length() - 1) - counter);
        	backup[(A.length() - 1) - counter] = temp;
        	counter++;
        }
		
        if(A.equals(String.valueOf(backup)))
        	System.out.println("Yes");
        else
        	System.out.println("No");
	}
	
}
