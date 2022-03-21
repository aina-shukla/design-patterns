package com.patterns.singleton.serializable;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class MainClass {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

		SingletonAndSerialization obj1 = SingletonAndSerialization.method();
		ObjectOutputStream output = new ObjectOutputStream(
				new FileOutputStream(new File("C:\\Users\\shukl\\OneDrive\\Desktop\\SingletonAndSerialization.ser")));
		output.writeObject(obj1);

		SingletonAndSerialization obj2 = SingletonAndSerialization.method();
		ObjectInputStream input = new ObjectInputStream(
				new FileInputStream(new File("C:\\Users\\shukl\\OneDrive\\Desktop\\SingletonAndSerialization.ser")));
		obj2 = (SingletonAndSerialization) input.readObject();

		output.close();
		input.close();
		
		System.out.println(obj1 == obj2);

	}

}