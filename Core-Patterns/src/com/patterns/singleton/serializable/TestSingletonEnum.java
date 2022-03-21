package com.patterns.singleton.serializable;

public class TestSingletonEnum {

	public static void main(String[] args) {

		SingletonEnum var= SingletonEnum.VAR;
		System.out.println(var.getName());
		var.setName("java");
		System.out.println(var.getName());
	}

}
