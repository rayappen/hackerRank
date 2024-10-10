package com.learning.String;

public class Java_Anagrams {

	static boolean isAnagram(String a, String b) {

		int strAChar = 0;
		int strBChar = 0;
		char baseChar;
		int counter = 0;
		int innerCounter = 0;
		boolean isAnagram = false;

		if (a.length() + b.length() == 0 || a.length() != b.length()) {
			return isAnagram;
		} else {

			a = a.toLowerCase();
			b = b.toLowerCase();

			while (counter < a.length()) {

				innerCounter = 0;
				baseChar = a.charAt(counter);

				while (innerCounter < a.length()) {
					if (Character.compare(baseChar, a.charAt(innerCounter)) == 0) {
						strAChar++;
					}

					if (Character.compare(baseChar, b.charAt(innerCounter)) == 0) {
						strBChar++;
					}

					innerCounter++;
				}

				if (strAChar == strBChar) {
					isAnagram = true;
				} else {
					isAnagram = false;
					break;
				}

				strAChar = 0;
				strBChar = 0;

				counter++;
			}

			return isAnagram;
		}
	}

	public static void main(String[] args) {
		System.out.println(isAnagram("abc", "cba"));
	}

}
