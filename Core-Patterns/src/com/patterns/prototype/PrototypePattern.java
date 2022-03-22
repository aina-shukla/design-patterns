package com.patterns.prototype;

public class PrototypePattern {

	// creational design pattern
	// uses existing object to create new object

	public static void main(String[] args) throws CloneNotSupportedException {

		Game game1 = new Game();
		game1.setId(12);
		game1.setName("Overwatch");
		game1.setMembership(new Membership());

		Game game2 = game1.clone();
		System.out.println(game1);
		System.out.println(game2);

		Game game3 = new Game(game2);
		System.out.println(game3);

	}

}
