package com.learning.Welcome;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Java_Loops_I {

	public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        int multipler = 1;
        
        while(multipler <= 10)
        {
        	System.out.printf("%d x %d = %d\n", N, multipler, (multipler*N));
        	multipler++;
        }

        bufferedReader.close();
    }
	
}
