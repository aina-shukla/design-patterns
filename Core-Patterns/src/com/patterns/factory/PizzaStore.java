package com.patterns.factory;

public class PizzaStore {

	public Pizza orderPizza(String pizza) {
		Pizza p = PizzaFactory.createPizzaMethod(pizza);
		
		p.prepare();
		p.bake();
		p.cut();
		
		return p;
	}
}
