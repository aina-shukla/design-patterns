package com.patterns.adapter;

public class WeatherAdapter {

	public int findTemperature(int zipCode) {
		String city = null;

		if (zipCode == 19406) {
			city = "King of Prussia";
		}
		WeatherFinder finder = new WeatherFinderImpl();
		int temp = finder.findCity(city);

		return temp;
	}
}
