package com.patterns.adapter;

public class WeatherFinderImpl implements WeatherFinder {

	@Override
	public int findCity(String city) {
		//returning temperature as hard-coded
		return 33;
	}

}
