package com.learning.NewConcept;

import java.math.BigInteger;

public class Biginteger {
	
	public static void main(String[] args) {
		
		int a, b;
		
		a = 54;
		b = 23;
		
		BigInteger A  = BigInteger.valueOf(a);
		BigInteger B  = BigInteger.valueOf(b);
		
		BigInteger bigInteger2 = new BigInteger("197");
        System.out.println("IsProbablePrime method will return : "+ A.isProbablePrime(100));
        System.out.println("IsProbablePrime method will return : "+ B.isProbablePrime(100));
        System.out.println("IsProbablePrime method will return : "+ bigInteger2.isProbablePrime(2));  
		
	}
	
}
