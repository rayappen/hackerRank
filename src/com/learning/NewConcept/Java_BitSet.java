package com.learning.NewConcept;

import java.util.BitSet;
import java.util.Scanner;

public class Java_BitSet {

	enum BitOperation {
		AND, SET, FLIP, OR;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int bitLength = sc.nextInt();
		int operations = sc.nextInt();

		BitSet b1 = new BitSet(bitLength);
		BitSet b2 = new BitSet(bitLength);

		while (operations-- > 0) {
			
			String str = sc.next();
			int bitSet = sc.nextInt();
			int elementIndex = sc.nextInt();

			switch (str) {
			case "AND": {
				if (bitSet == 1)
					b1.and(b2);
				else
					b2.and(b1);
				break;
			}
			case "SET": {
				if (bitSet == 1)
					b1.set(elementIndex);
				else
					b2.set(elementIndex);

				break;
			}
			case "FLIP": {
				if (bitSet == 1)
					b1.flip(elementIndex);
				else
					b2.flip(elementIndex);
				break;
			}
			case "OR": {
				if (bitSet == 1)
					b1.or(b2);
				else
					b2.or(b1);
				break;
			}
			case "XOR": {
				if (bitSet == 1)
					b1.xor(b2);
				else
					b2.xor(b1);
				break;
			}
			default:
				break;

			}
			System.out.println(b1.cardinality() + " " + b2.cardinality());
		}
		
		sc.close();
	}

}
