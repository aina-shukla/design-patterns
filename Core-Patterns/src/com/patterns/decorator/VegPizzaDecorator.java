package com.patterns.decorator;

public class VegPizzaDecorator extends PizzaDecorator {

	public VegPizzaDecorator(Pizza pizza) {
		super(pizza);
	}
	
	public void bake() {
		super.bake();
		System.out.println("Adding veg toppings");
	}

}
