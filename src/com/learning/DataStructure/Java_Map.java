package com.learning.DataStructure;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Java_Map {

	public static void main(String[] argh) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		in.nextLine();

		Map<String, Long> contact = new HashMap<>();

		for (int i = 0; i < n; i++) {
			String name = in.nextLine().toLowerCase();
			long phone = in.nextLong();
			in.nextLine();
			contact.put(name, phone);
		}

		while (in.hasNext()) {
			String s = in.nextLine().toLowerCase();

			if (contact.containsKey(s)) {
				System.out.println(s + "=" + contact.get(s));
			}
			else
			{
				System.out.println("Not found");
			}

		}
		
		in.close();
	}

}
