package com.practise;

public class Vehicle4Job implements Runnable {
	private Booth booth=new Booth();
	private Toll toll=new Toll();
	public Vehicle4Job(Booth booth, Toll toll) {
		super();
		this.booth = booth;
		this.toll = toll;
	}
	@Override
	public void run() {
		booth.Vehicle4();
		toll.Vehicle4();
	}
}
