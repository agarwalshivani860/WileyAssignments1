package com.practise;

public class Vehicle1Job implements Runnable{
private Booth booth=new Booth();
private Toll toll=new Toll();
public Vehicle1Job(Booth booth, Toll toll) {
	super();
	this.booth = booth;
	this.toll = toll;
}
@Override
public void run() {
	// TODO Auto-generated method stub
	booth.Vehicle1();
	toll.Vehicle1();
}

}
