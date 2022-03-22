package com.patterns.builder;

import com.patterns.builder.HTTPClient.HttpClientBuilder;

public class BuilderPattern {

	public static void main(String[] args) {

		HttpClientBuilder client = new HTTPClient.HttpClientBuilder(); 
		HTTPClient httpClient = client.method("POST").url("test/url").secure("bob", "bob").header("header").body("{}").build();
		System.out.println(httpClient);
	}

}
