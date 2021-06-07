package org.animals;

public abstract class Animals {
private int weight,age;
private String color;
public Animals(int weight,int age,String color)
{
	super();
	this.weight=weight;
	this.age=age;
	this.color=color;
}
public int getWeight() {
	return weight;
}
public void setWeight(int weight) {
	this.weight = weight;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
abstract public void isVegetarian();
abstract public void canClimb();
abstract public void sound(); 
}
