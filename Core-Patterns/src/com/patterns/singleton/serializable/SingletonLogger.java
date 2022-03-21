package com.patterns.singleton.serializable;

import java.lang.System.Logger;
import java.util.ResourceBundle;

public class SingletonLogger implements Logger {

	private static volatile SingletonLogger var; 
	private SingletonLogger() {
	}
	
	@Override
	public String getName() {
		return null;
	}

	@Override
	public boolean isLoggable(Level level) {
		return false;
	}

	@Override
	public void log(Level level, ResourceBundle bundle, String msg, Throwable thrown) {		
	}

	@Override
	public void log(Level level, ResourceBundle bundle, String format, Object... params) {		
	}

	public static SingletonLogger log(String message) {
		if (var == null) {
			synchronized (SingletonLogger.class) {
				if (var == null) {
					var = new SingletonLogger();
					System.out.println(message);
				}
			}
		}
		return var;
	}

	protected Object readResolve() { 
		return var;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {  
		throw new CloneNotSupportedException();
	}
}
