package com.learning.DataStructure;

import java.util.HashSet;
import java.util.Scanner;

public class Java_Hashset {

	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];
        
        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }
        
        HashSet<String> set = new HashSet<>();
        
        for(int i = 0; i < t; i++)
        {
        	set.add(pair_left[i].trim() + " " + pair_right[i].trim());
        	System.out.println(set.size());
        }
        s.close();
   }
	
}
