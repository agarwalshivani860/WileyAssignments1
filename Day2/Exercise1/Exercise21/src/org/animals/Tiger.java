package org.animals;

public class Tiger extends Animals {
	public Tiger(int weight, int age, String color) {
		super(weight, age, color);
		
	}

	public void isVegetarian() {
		System.out.println("Tigers are CARNIVOROUS");
	}

	public void canClimb() {
		System.out.println("No they cannot Climb");
	}

	public void sound() {
		System.out.println("ROARRRRRR");
	}
}
