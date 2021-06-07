package org.animals;

public class Giraffe extends Animals {
	public  Giraffe(int weight,int age,String color)
	{
		super(weight,age,color);
	}

	@Override
	public void isVegetarian() {
	 System.out.println("Giraffe are HERBIVOROUS");
	}

	@Override
	public  void canClimb() {
	 System.out.println("No they cannot Climb");
	}

	@Override
	public void sound() {
		System.out.println("HUMMMMM");
	}
}
