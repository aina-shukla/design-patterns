package com.patterns.proxy;

import java.util.List;

public class CustomerImpl implements Customer {

	private int getId;
	private List<Orders> getOrders;

	CustomerImpl() {
		this.getId = 123;
	}

	public int getGetId() {
		return getId;
	}

	public void setGetId(int getId) {
		this.getId = getId;
	}

	public List<Orders> getGetOrders() {
		return getOrders;
	}

	public void setGetOrders(List<Orders> getOrders) {
		this.getOrders = getOrders;
	}

	@Override
	public int getId() {
		return 0;
	}

	@Override
	public List<Orders> getOrders() {
		return null;
	}

}