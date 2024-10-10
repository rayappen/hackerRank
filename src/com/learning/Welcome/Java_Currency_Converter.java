package com.learning.Welcome;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Java_Currency_Converter {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        Locale usLocale = Locale.US;
        NumberFormat usFormat = NumberFormat.getCurrencyInstance(usLocale);
        System.out.println("US: " + usFormat.format(payment));

        Locale indiaLocale = new Locale("en", "IN");
        NumberFormat indiaFormat = NumberFormat.getCurrencyInstance(indiaLocale);
        DecimalFormatSymbols dfs = new DecimalFormatSymbols();
        dfs.setCurrencySymbol("Rs.");
        ((DecimalFormat) indiaFormat).setDecimalFormatSymbols(dfs);
        System.out.println("India: " + indiaFormat.format(payment));

        Locale chinaLocale = Locale.CHINA;
        NumberFormat chinaFormat = NumberFormat.getCurrencyInstance(chinaLocale);
        System.out.println("China: " + chinaFormat.format(payment));

        Locale franceLocale = Locale.FRANCE;
        NumberFormat franceFormat = NumberFormat.getCurrencyInstance(franceLocale);
        System.out.println("France: " + franceFormat.format(payment));
	}

	
}
