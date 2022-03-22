package com.patterns.decorator;

public class PizzaShop {

	// decorator pattern is a behavioral pattern that adds some additional
	// functionalities to object dynamically at runtime

	public static void main(String[] args) {

		Pizza pizza = new VegPizzaDecorator(new CheesePizzaDecorator(new PlainPizza()));  //wrapping decorators
		pizza.bake();
	}

}
