package com.patterns.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {

	private static Map<String, Shape> shapemap = new HashMap<>();

	public static Shape getShape(String type) {
		Shape shapeObj = null;
		if (shapemap.get(type) != null) {
			shapeObj = shapemap.get(type);
		} else {
			if (type.equals("circle")) {
				shapeObj = new Circle();
			} else if (type.equals("rectangle")) {
				shapeObj = new Rectangle();

			}

			shapemap.put(type, shapeObj);

		}
		return shapeObj;
	}
}
