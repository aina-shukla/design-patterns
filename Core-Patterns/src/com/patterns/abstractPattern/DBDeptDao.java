package com.patterns.abstractPattern;

public class DBDeptDao implements Dao {

	@Override
	public void save() {
		System.out.println("Saving Dept to DB");
	}

}
