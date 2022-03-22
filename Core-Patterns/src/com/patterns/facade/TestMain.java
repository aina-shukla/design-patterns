package com.patterns.facade;

public class TestMain {

	public static void main(String[] args) {

		OrderFacade facade = new OrderFacade();
		facade.processOrder("iphone", 2);
	}
}
