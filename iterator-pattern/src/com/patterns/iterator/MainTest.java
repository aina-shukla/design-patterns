package com.patterns.iterator;

public class MainTest {

	public static void main(String[] args) {

		ProductCollection collection = new ProductCollection();
		collection.addProduct(new Product("iphone"));
		collection.addProduct(new Product("macbook"));

		collection.addProduct(new Product("samsung"));

		Iterator iterator = collection.iterator();
		while (iterator.hasNext()) {
			Product product = (Product) iterator.next();
			System.out.println(product.getName());
		}

	}

}
