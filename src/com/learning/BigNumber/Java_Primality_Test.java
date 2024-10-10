package com.learning.BigNumber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Java_Primality_Test {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();
        
        bufferedReader.close();
		
        BigInteger bigInteger = new BigInteger(n);
        
        boolean prime = bigInteger.isProbablePrime(100);
        
        if(prime)
        {
        	System.out.println("prime");
        }
        else
        {
        	System.out.println("not prime");
        }
	}

}
