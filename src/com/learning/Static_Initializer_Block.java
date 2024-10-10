package com.learning;

import java.util.Scanner;

public class Static_Initializer_Block {
	
	private static int B;
	private static int H;
//	private static boolean flag = (B > 0) && (H > 0);

public static void main(String[] args){
	
	Scanner sc = new Scanner(System.in);
	B = Integer.parseInt(sc.nextLine());
	H = Integer.parseInt(sc.nextLine());
	sc.close();
	
	boolean flag = (B > 0) && (H > 0);
	
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		else
			System.out.print("java.lang.Exception: Breadth and height must be positive");	
	
	}//end of main

}//end of class
