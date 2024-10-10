package com.learning.BigNumber;

import java.util.Scanner;

public class Java_BigDecimal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		String[] s = new String[n + 2];

		for (int i = 0; i < n; i++) {
			s[i] = sc.nextLine();
		}
		sc.close();
	
		for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (Double.parseDouble(s[j]) < Double.parseDouble(s[j + 1])) {
                    String temp = s[j];
                    s[j] = s[j + 1];
                    s[j + 1] = temp;
                }
            }
        }

		for (int i = 0; i < n; i++) {
			System.out.println(s[i]);
		}

	}

}
