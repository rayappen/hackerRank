package com.learning.NewConcept;

abstract class Shape {

	String color;

	abstract void draw();

	void setColor(String color) {
		this.color = color;
	}

	String getColor() {
		return color;
	}
}

class Circle extends Shape {
	
	@Override
	void draw() {
		System.out.println("Drawing a circle.");
	}
	
	@Override
	void setColor(String color) {
		this.color = "pink";
	}
	
}

public class Java_Abstract_Class {

	public static void main(String[] args) {

		Circle circle = new Circle();
		
		circle.setColor("red");
		System.out.println(circle.getColor());
	}
}
