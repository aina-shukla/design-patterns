package com.patterns.template;

public class XMLDataRenderer extends DataRenderer {

	@Override
	public String readData() {
		return "xml";
	}

	@Override
	public String processData(String data) {
		return "processed "+data;
	}

}
