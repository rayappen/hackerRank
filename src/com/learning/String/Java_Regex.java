package com.learning.String;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Java_Regex {

	public static void main(String[] args) {
		
		String reg = "[0-9]+\\.[0-9]+\\.[0-9]+\\.[0-9]+";
		Pattern pattern = Pattern.compile(reg);
		Matcher matcher = pattern.matcher("666.666.23.23");
		boolean matchFound = matcher.find();
	    if(matchFound) {
	      System.out.println("Match found");
	    } else {
	      System.out.println("Match not found");
	    }
	}
	
}
