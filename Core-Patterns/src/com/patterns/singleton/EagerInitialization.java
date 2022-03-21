package com.patterns.singleton;

public class EagerInitialization {

	private static EagerInitialization var = new EagerInitialization();

	// OR

	// using static
//	static {
//		var = new EagerInitialization();
//	}

	private EagerInitialization() {
	}

	public static EagerInitialization method() {
		return var;
	}
}
