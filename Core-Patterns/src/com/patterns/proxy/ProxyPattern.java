package com.patterns.proxy;

public class ProxyPattern {

	// proxy comes in place of actual object

	public static void main(String s[]) {

		Customer customer = new CustomerProxyImpl();
		System.out.println(customer.getId() + " " + customer.getOrders());
	}
}
