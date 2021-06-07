package com.practise;

public class Vehicle3Job implements Runnable {
	private Booth booth=new Booth();
	private Toll toll=new Toll();
	public Vehicle3Job(Booth booth, Toll toll) {
		super();
		this.booth = booth;
		this.toll = toll;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		booth.Vehicle3();
		toll.Vehicle3();
	}
}
