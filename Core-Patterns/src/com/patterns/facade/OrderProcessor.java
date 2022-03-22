package com.patterns.facade;

public class OrderProcessor {

	public boolean checkStock(String nameOfProduct) {
		System.out.println("Checking stock..");
		return true;
	}
	
	public String placeOrder(String nameOfProduct, int quantity) {
		System.out.println("Order placed.");
		return "13dg65";
	}
	
	public void shipOrder(String shipId) {
		System.out.println("Order shipped.");
	}
}
