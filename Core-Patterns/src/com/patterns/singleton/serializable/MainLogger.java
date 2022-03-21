package com.patterns.singleton.serializable;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class MainLogger {

	public static void main(String[] args) {
		SingletonLogger obj1 = SingletonLogger.log("java");
		SingletonLogger obj2 = SingletonLogger.log("learning");
		System.out.println(obj1 == obj2);

	}

}
