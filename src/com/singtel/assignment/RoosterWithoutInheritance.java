package com.singtel.assignment;

import com.singtel.model.Chicken;

public class RoosterWithoutInheritance {

	Chicken chkn = new Chicken();

	public void fly() {
		chkn.fly();

	}

	public void sing() {

		System.out.println("Cock-a-doodle-doo");
	}

	public void walk() {
		chkn.walk();
	}
}
