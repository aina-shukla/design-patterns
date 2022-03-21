package com.patterns.singleton;

public class TestSingletonExampleAndEagerInitialization {

	public static void main(String[] args) {
		SingletonExample obj1 = SingletonExample.method();
		SingletonExample obj2 = SingletonExample.method();
		System.out.println(obj1 == obj2);

		EagerInitialization obj3 = EagerInitialization.method();
		EagerInitialization obj4 = EagerInitialization.method();
		System.out.println(obj3 == obj4);

		SynchronizedSingletonExample obj5 = SynchronizedSingletonExample.method();
		SynchronizedSingletonExample obj6 = SynchronizedSingletonExample.method();
		System.out.println(obj5 == obj6);
	}

}
