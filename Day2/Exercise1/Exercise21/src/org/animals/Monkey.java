package org.animals;

public class Monkey extends Animals{
	public Monkey(int weight,int age,String color)
	{
		super(weight,age,color);
	}

	@Override
	public void isVegetarian() {
	 System.out.println("Monkey are OMNIVOROUS");
	}

	@Override
	public void canClimb() {
	 System.out.println("They can Climb");
	}

	@Override
	public void sound() {
		System.out.println("SQUEEK");
	}
}
