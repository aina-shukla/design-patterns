package com.patterns.ioc;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
class IocPatternApplicationTests {

	@Autowired
	Customer customer;
	
	@Test
	public void testPayments() {
		customer.pay();
	}

}