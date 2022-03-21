package com.patterns.template;

public class MainClass {

	public static void main(String[] args) {

		DataRenderer dataRendererXML = new XMLDataRenderer();
		dataRendererXML.render();
		
		DataRenderer dataRendererCSV = new CSVDataRenderer();
		dataRendererCSV.render();
	}

}
