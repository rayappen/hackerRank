package com.learning.String;

import java.util.Scanner;

public class Java_String_Tokens {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		scan.close();
		str = str.trim();
		
		if(str.length() < 1 || str.length() > 400000 || str == null)
		{
			System.out.print(0);
		}
		else
		{	
			String[] myArray = str.split("[ !,?._'@]+");
			System.out.println(myArray.length);
			for (String s : myArray) {
			  System.out.println(s);
			}
		}
	}

}
