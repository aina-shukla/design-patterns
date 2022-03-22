package com.patterns.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public void create(Employee employee) {
		String sql = "insert into employee values(?,?)";
		jdbcTemplate.update(sql, employee.getId(), employee.getName());
	}

}
