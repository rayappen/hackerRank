package com.learning.BigNumber;

import java.math.BigInteger;
import java.util.Scanner;

public class Java_BitInteger {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String inputOne = sc.nextLine();
		String inputTwo = sc.nextLine();
		sc.close();

		if (inputOne.length() < 200 && inputTwo.length() < 200) {

			BigInteger b1 = new BigInteger(inputOne);
			BigInteger b2 = new BigInteger(inputTwo);

			if (b1.compareTo(BigInteger.ZERO) > 0) {

				System.out.println(b1.add(b2));
				System.out.println(b1.multiply(b2));

			}

		}

	}

}
