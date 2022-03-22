package com.patterns.iterator;

public class ProductCollection implements Collection {

	int numberOfProducts = 0;
	Product[] products;

	public ProductCollection() {
		products = new Product[10];
	}

	public void addProduct(Product product) {
		products[numberOfProducts] = product;
		numberOfProducts++;
	}

	@Override
	public Iterator iterator() {
		return new ProductIterator(products);
	}
}
