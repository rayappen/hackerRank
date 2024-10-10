package com.learning.ObjectOrientedProgramming;

import java.util.Scanner;

abstract class Book {
	
	String title;

	abstract void setTitle(String s);

	String getTitle() {
		return title;
	}

}

class MyBook extends Book {

	@Override
	void setTitle(String s) {
		title = s;
	}

}

//This is a test method not the part of actual solution
class MyAnotherBook extends Book {

	@Override
	void setTitle(String s) {
		title = s;
	}

}

public class Java_Abstract_Class {

	public static void main(String[] args) {
		// Book new_novel=new Book(); This line prHMain.java:25: error: Book is
		// abstract; cannot be instantiated
		Scanner sc = new Scanner(System.in);
		String title = sc.nextLine();
		MyBook new_novel = new MyBook();
		new_novel.setTitle(title);
		System.out.println("The title is: " + new_novel.getTitle());
		sc.close();
		
		System.out.println("//This is a test output");
		MyAnotherBook test = new MyAnotherBook();
		test.setTitle("demo 1");
		System.out.println(test.getTitle());
		
		System.out.println("//Second test");
		System.out.println(new_novel.getTitle());
	}

}
