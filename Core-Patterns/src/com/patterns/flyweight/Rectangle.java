package com.patterns.flyweight;

public class Rectangle extends Shape {


	@Override
	public void drawRec(int length, int width, String color) {
		System.out.println("Drawing rectangle of length as " + length + " , width " + width + " and color " + color);

	}

}
