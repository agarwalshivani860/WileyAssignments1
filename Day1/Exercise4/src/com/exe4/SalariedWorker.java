package com.exe4;

public class SalariedWorker extends Worker {
	int salary;
	int hours=40;
	public SalariedWorker(String name, int rate) {
		super.setName(name);
		super.setRate(rate);
	}
	
	public void Pay() {
		this.salary=(hours/8)*(super.getRate());
	}
	
	public void displaySalary() {
		System.out.println("Salary is: "+this.salary);
	}
}
