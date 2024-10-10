package com.learning.DataStructure;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Java_Stack {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<String> list = new ArrayList<>();
		
		while (sc.hasNext()) {
			
			String input=sc.next();
			list.add(input);
		}
				
		for (String input : list) {
	        if (isBalanced(input)) {
	            System.out.println("true");
	        } else {
	            System.out.println("false");
	        }
	    }
	    sc.close();
		
	}

	
	public static boolean isBalanced(String str)
	{
		
		Stack<Character> stack = new Stack<>();
		
		if(str.length() == 0)
			return true;
		else if(str.length() %2 != 0)
			return false;
		else
		{
			for(Character ch : str.toCharArray())
			{
				
				if(ch == '{' || ch == '[' || ch == '(')
				{
					stack.push(ch);
				}
				else if(stack.empty())
				{
					return false;
				}
				else
				{
					char pair = stack.pop();
					if((ch == '}' && pair != '{')
					|| (ch == ']' && pair != '[')
					|| (ch == ')' && pair != '('))
					{
						return false;
					}
				}
			}
		}
		
		return stack.isEmpty();
	}
}
