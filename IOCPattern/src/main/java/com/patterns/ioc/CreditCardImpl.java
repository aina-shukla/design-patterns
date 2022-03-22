package com.patterns.ioc;

import org.springframework.stereotype.Component;

@Component
public class CreditCardImpl implements CreditCard {

	
	
	@Override
	public void makePayments() {
		System.out.println("Payment made");
	}

}
