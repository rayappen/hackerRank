package com.learning.String;

import java.util.Scanner;

public class Java_Substring {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        in.close();
		
		System.out.println(S.substring(start, end));
	}

}
