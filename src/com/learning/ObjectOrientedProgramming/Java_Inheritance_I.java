package com.learning.ObjectOrientedProgramming;

class Animal{
	
	String test;
	
	void walk()
	{
		System.out.println("I am walking");
	}
	
	String getTest() {
    	return test;
    }
}

class Bird extends Animal
{
	
	
	void fly()
	{
		System.out.println("I am flying");
	}
    
    void sing()
    {
        System.out.println("I am singing");
    }
    
    void test(String input)
    {
    	test = input;
    }
    
}

public class Java_Inheritance_I {
	
	public static void main(String args[]){

		  Bird bird = new Bird();
		  bird.walk();
		  bird.fly();
	      bird.sing();
	      bird.test("This is a test input");
	      System.out.println(bird.getTest());
	      
	   }

}
