package com.singtel.model;

import com.singtel.BOinterface.Animal;

public class Parrot extends Bird {

	Animal animal = null;

	public void livingWith(Animal animal) {
		this.animal = animal;

	}

	public boolean fly() {
		System.out.println("I am flying");
		return true;
	}

	public boolean sing() {
		if (animal == null) {
			this.livingWith(new Duck());
		}
		animal.sing();
		return true;
	}

	@Override
	public boolean walk() {
		System.out.println("I am walking");
		return true;
	}
}
