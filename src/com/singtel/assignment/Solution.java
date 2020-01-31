package com.singtel.assignment;

import java.util.ArrayList;
import java.util.List;

import com.singtel.BOinterface.Animal;
import com.singtel.model.Bird;
import com.singtel.model.Butterfly;
import com.singtel.model.Cat;
import com.singtel.model.Chicken;
import com.singtel.model.Clownfish;
import com.singtel.model.Dog;
import com.singtel.model.Dolphin;
import com.singtel.model.Duck;
import com.singtel.model.Parrot;
import com.singtel.model.Rooster;
import com.singtel.model.Shark;

public class Solution {

	public static void main(String[] args) {
		System.out.println("----------------DUCK START----------------");
		Animal myDuck = new Duck();
		myDuck.walk();
		myDuck.fly();
		myDuck.sing();
		System.out.println("----------------CHICKEN START----------------");
		Animal myChicken = new Chicken();
		myChicken.walk();
		myChicken.fly();
		myChicken.sing();
		System.out.println("----------------ROOSTER START----------------");
		Animal myRooster = new Rooster();
		myRooster.walk();
		myRooster.fly();
		myRooster.sing();
		System.out.println("----------------ROOSTER WITHOUT INHERITANCE ----------------");
		RoosterWithoutInheritance myRoosterDel = new RoosterWithoutInheritance();
		myRoosterDel.walk();
		myRoosterDel.fly();
		myRoosterDel.sing();
		System.out.println("----------------PARROT LIVING WITH DOGS----------------");
		Parrot myParrotwithDogs = new Parrot();
		myParrotwithDogs.livingWith(new Dog());
		myParrotwithDogs.walk();
		myParrotwithDogs.fly();
		myParrotwithDogs.sing();
		System.out.println("----------------PARROT LIVING WITH CATS----------------");
		Parrot myParrotwithCats = new Parrot();
		myParrotwithCats.livingWith(new Cat());
		myParrotwithCats.walk();
		myParrotwithCats.fly();
		myParrotwithCats.sing();
		System.out.println("----------------PARROT LIVING WITH ROOSTERS----------------");
		Parrot myParrotWithRoosters = new Parrot();
		myParrotWithRoosters.livingWith(new Rooster());
		myParrotWithRoosters.walk();
		myParrotWithRoosters.fly();
		myParrotWithRoosters.sing();
		System.out.println("----------------PARROT LIVING WITH DUCKS----------------");
		Parrot myParrotWithDucks = new Parrot();
		myParrotWithDucks.livingWith(new Duck());
		myParrotWithDucks.walk();
		myParrotWithDucks.fly();
		myParrotWithDucks.sing();
		System.out.println("----------------SHARK----------------");
		Shark mySFish = new Shark();
		mySFish.fly();
		mySFish.sing();
		mySFish.walk();
		mySFish.swim();
		mySFish.colour();
		mySFish.eat();
		mySFish.makeJokes();
		System.out.println("----------------CLOWNFISH----------------");
		Clownfish myCFish = new Clownfish();
		myCFish.fly();
		myCFish.sing();
		myCFish.walk();
		myCFish.swim();
		myCFish.colour();
		myCFish.eat();
		myCFish.makeJokes();
		System.out.println("----------------DOLPHIN----------------");
		Dolphin dolphin = new Dolphin();
		dolphin.hasFishBehaviour(new Shark());
		dolphin.fly();
		dolphin.sing();
		dolphin.swim();
		dolphin.walk();
		System.out.println("----------------BUTTERFLY----------------");
		Butterfly myButterFly = new Butterfly();
		myButterFly.setCaterpiller(false);
		myButterFly.fly();
		myButterFly.sing();
		myButterFly.walk();
		System.out.println("----------------CATERPILLAR----------------");
		Butterfly myCaterpillar = new Butterfly();
		myCaterpillar.setCaterpiller(true);
		myCaterpillar.fly();
		myCaterpillar.sing();
		myCaterpillar.walk();
		System.out.println("----------------Animal Count----------------");
		Animal[] animals = new Animal[] { new Bird(), new Duck(), new Chicken(), new Rooster(), new Parrot(),
				new Shark(), new Clownfish(), new Dog(), new Butterfly(), new Cat() };
		int flyingCount = 0;
		int countWalk = 0;
		int countSing = 0;
		int countSwim = 0;
		for (Animal animal : animals) {
			System.out.println(animal.getClass().getName() + "---count start--------------------");
			if (animal.fly())
				flyingCount++;
			if (animal.walk())
				countWalk++;
			if (animal.sing())
				countSing++;
			if (animal.swim())
				countSwim++;
			 System.out.println("------------------------count end---------------------");
		}
		System.out.println("Total Animals that can fly : " + flyingCount);
		System.out.println("Total Animals that can walk : " + countWalk);
		System.out.println("Total Animals that can sing : " + countSing);
		System.out.println("Total Animals that can swim : " + countSwim);
		
		System.out.println("---------------------------ROOSTER SOUND IN DIFFERENT LANGUAGE--------------------");

		Rooster myRstr = new Rooster();
		
		List<String> lanugageList = new ArrayList<String>() {
			{
				add("English");
				add("Danish");
				add("Dutch");
				add("Finnish");
				add("French");
				add("German");
				add("Greek");
				add("Hebrew");
				add("Hungarian");
				add("Italian");
				add("Japanese");
				add("Portuguese");
				add("Russian");
				add("Swedish");
				add("Turkish");
				add("Urdu");
			}
		};

		lanugageList.forEach(lang -> myRstr.sing(lang));
	}

}
