package com.learning.Welcome;

import java.util.Calendar;

public class Java_Date_And_Time {

	public static void main(String[] args) {

		System.out.println(findDay(8, 1, 2024));

	}

	public static String findDay(int month, int day, int year) {

		Calendar cal = Calendar.getInstance();
		month -= 1;

		cal.set(year, month, day);

		switch (cal.get(Calendar.DAY_OF_WEEK)) {
		case 1: {
			return "SUNDAY";
		}
		case 2: {
			return "MONDAY";
		}
		case 3: {
			return "TUESDAY";
		}
		case 4: {
			return "WEDNESDAY";
		}
		case 5: {
			return "THURSDAY";
		}
		case 6: {
			return "FRIDAY";
		}
		case 7: {
			return "SATURDAY";
		}
		default: {
			return "invalid";
		}
		}
	}

}
