package com.learning.NewConcept;

public class JavaPrintf {

	public static void main(String[] args) {
		
		int a = 1000;
		double d = 23.3456;
		boolean b = true;
		String s = "Java";
		int num = 100;
		
		System.out.printf("%,d", a);
		System.out.println("");
		System.out.printf("%4.2f", d);
		System.out.println("");
		System.out.printf("%6.2f", d);
		System.out.println("");
		System.out.printf("%B", b);
		System.out.println("");
		System.out.printf("%s", s);
		System.out.println("");
		System.out.printf("%-15s%03d", s, num);
	}
	
}
