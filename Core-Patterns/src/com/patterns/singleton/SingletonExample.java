package com.patterns.singleton;

public class SingletonExample {

	private static SingletonExample var;

	private SingletonExample() {
	}

	public static SingletonExample method() {
		//lazy initialization
		if(var == null)
		var = new SingletonExample();
		return var;
	}

}
