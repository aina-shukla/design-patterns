package com.patterns.proxy;

import java.util.ArrayList;
import java.util.List;

public class CustomerProxyImpl implements Customer {

	CustomerImpl customerImpl = new CustomerImpl();

	@Override
	public int getId() {
		return customerImpl.getId();
	}

	@Override
	public List<Orders> getOrders() {
		ArrayList<Orders> list = new ArrayList<Orders>();
		Orders orders1 = new Orders();
		orders1.setId(1);
		orders1.setProductName("Toy");
		list.add(orders1);

		Orders orders2 = new Orders();
		orders2.setId(2);
		orders2.setProductName("Iphone");
		list.add(orders2);

		return list;
	}

}
