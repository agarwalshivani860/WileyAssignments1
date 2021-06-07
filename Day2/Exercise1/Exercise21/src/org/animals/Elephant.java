package org.animals;

public class Elephant extends Animals {
	public Elephant(int weight,int age,String color)
	{
		super(weight,age,color);
	}

	@Override
	public void isVegetarian() {
	 System.out.println("Elephant are HERBIVOROUS");
	}

	@Override
	public void canClimb() {
	 System.out.println("No they cannot Climb");
	}

	@Override
	public void sound() {
		System.out.println("TRUMPETTT");
	}
}
