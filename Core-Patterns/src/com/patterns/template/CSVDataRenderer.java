package com.patterns.template;

public class CSVDataRenderer extends DataRenderer {

	@Override
	public String readData() {
		return "csv";
	}

	@Override
	public String processData(String data) {
		return "processed "+data;
	}

}
