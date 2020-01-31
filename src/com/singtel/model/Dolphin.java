package com.singtel.model;

import com.singtel.BOinterface.Animal;
import com.singtel.BOinterface.Fish;

public class Dolphin implements Animal{

	Fish fish;
	
	public void hasFishBehaviour(Fish fish)
	{
		this.fish =fish;
	}
	
	@Override
	public boolean fly() {
		
		fish.fly();
		return fish.fly();
	}

	@Override
	public boolean sing() {
		fish.sing();
		return false;
	}

	@Override
	public boolean walk() {
		fish.walk();
		return false;
	}
	public boolean swim() {
		fish.swim();
		return true;
	}

}
