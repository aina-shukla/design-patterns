package com.patterns.singleton.serializable;

public enum SingletonEnum {

	VAR;
	String name;

	// no constructors in enum

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
