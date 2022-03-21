package com.patterns.abstractPattern;

public class DaoProducer {

	// factory of factories
	// hides creation process of factories itself
	// eg. jaxp

	public static DaoAbstractFactory produce(String factoryType) {
		DaoAbstractFactory abstractFactory = null;

		if (factoryType.equals("xml"))
			abstractFactory = new XMLDaoFactory();
		else if (factoryType.equals("db"))
			abstractFactory = new DBDaoFactory();
		return abstractFactory;
	}
}
