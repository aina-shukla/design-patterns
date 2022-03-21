package com.patterns.flyweight;

public class PaintApp {

	public void render(int numberOfShapes) {

		Shape shape = null;

		for (int i = 1; i <= numberOfShapes; i++) {
			if (i % 2 == 0) {
				shape = ShapeFactory.getShape("circle");
				shape.draw(2, "blue");
			}
			else
			{
				shape=ShapeFactory.getShape("rectangle");
				shape.drawRec(2, 4, "grey");
			}
		}
	}
}
