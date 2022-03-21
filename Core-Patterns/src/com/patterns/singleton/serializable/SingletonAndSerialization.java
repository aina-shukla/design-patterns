package com.patterns.singleton.serializable;

import java.io.Serializable;

public class SingletonAndSerialization implements Serializable, Cloneable {

	private static volatile SingletonAndSerialization var; // volatile - to handle issues in multi threading

	private SingletonAndSerialization() {
	}

	public static SingletonAndSerialization method() {
		// lazy initialization
		if (var == null) {
			synchronized (SingletonAndSerialization.class) {
				if (var == null) {
					var = new SingletonAndSerialization();
				}
			}
		}
		return var;
	}

	protected Object readResolve() { // internally called by ObjectInputStream during de-serialization
		return var;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {  // so that any other class can't clone the object of singleton class
		throw new CloneNotSupportedException();
	}
}
