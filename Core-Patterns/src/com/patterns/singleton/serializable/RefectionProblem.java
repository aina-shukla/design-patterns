package com.patterns.singleton.serializable;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class RefectionProblem {

	public static void main(String[] args) {
		SingletonAndSerialization obj1 = SingletonAndSerialization.method();
		SingletonAndSerialization obj2 = null;

		Constructor[] constructors = SingletonAndSerialization.class.getDeclaredConstructors();
		for (Constructor constructor : constructors) {
			constructor.setAccessible(true);
			try {
				obj2 = (SingletonAndSerialization) constructor.newInstance();
				break;
			} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
					| InvocationTargetException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
	}

}
