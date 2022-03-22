package com.patterns.ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustomerImpl implements Customer {

	@Autowired
	CreditCard card ;

	@Override
	public void pay() {
		card.makePayments();
	}

}
