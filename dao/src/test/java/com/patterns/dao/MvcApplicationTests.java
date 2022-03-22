package com.patterns.dao;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MvcApplicationTests {

	@Autowired
	EmployeeDao dao;
	
	@Test
	public void testCreate() {
		Employee employee = new Employee();
		employee.setId(123);
		employee.setName("bob");
		dao.create(employee);
	}

}
