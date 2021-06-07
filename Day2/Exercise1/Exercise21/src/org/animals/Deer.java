package org.animals;

public class Deer extends Animals {
	public Deer(int weight,int age,String color)
	{
		super(weight,age,color);
	}

	@Override
	public
	void isVegetarian() {
	 System.out.println("Deer are HERBIVOROUS");
	}

	@Override
	public
	void canClimb() {
	 System.out.println("No they cannot Climb");
	}

	@Override
	public
	void sound() {
		System.out.println("GRUNTTT");
	}
}
