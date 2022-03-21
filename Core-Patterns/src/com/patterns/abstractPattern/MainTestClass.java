package com.patterns.abstractPattern;

public class MainTestClass {

	public static void main(String[] args) {

		DaoAbstractFactory daf = DaoProducer.produce("db");
		Dao dao = daf.createDao("emp");
		dao.save();
	}

}
