package com.patterns.factory;

public class PizzaFactory {

	// factory pattern is a creational pattern, that hides the complex process of
	// object creation

	public static Pizza createPizzaMethod(String pizza) {
		Pizza p = null;

		if (pizza.equals("cheese"))
			p = new CheesePizza();
		else if (pizza.equals("chicken"))
			p = new ChickenPizza();
		else if (pizza.equals("veg"))
			p = new VegPizza();
		
		return p;
	}
}
