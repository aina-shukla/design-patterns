package com.patterns.flyweight;

public class Circle extends Shape {
	
	@Override
	public void draw(int radius, String color) {
		System.out.println("Drawing circle of radius " + radius + " and color " + color);
	}

}
