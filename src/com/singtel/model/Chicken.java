package com.singtel.model;

public class Chicken extends Bird {

	public boolean fly() {
		System.out.println("I cannot fly");
		return false;
	}

	public boolean sing() {

		System.out.println("Cluck, cluck");
		return true;
	}

}
