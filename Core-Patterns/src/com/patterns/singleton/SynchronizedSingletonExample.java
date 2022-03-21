package com.patterns.singleton;

public class SynchronizedSingletonExample {

	private static SynchronizedSingletonExample var;

	private SynchronizedSingletonExample() {
	}

	public static SynchronizedSingletonExample method() {
		//lazy initialization
		synchronized(SynchronizedSingletonExample.class) {   //making it synchronized so that one thread can access it at a time and appying class-level lock
		if(var == null)
		var = new SynchronizedSingletonExample();
		}
		return var;
	}
}
