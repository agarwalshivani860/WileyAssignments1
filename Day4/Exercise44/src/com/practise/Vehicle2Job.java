package com.practise;

public class Vehicle2Job implements Runnable {
	private Booth booth=new Booth();
	private Toll toll=new Toll();
	public Vehicle2Job(Booth booth, Toll toll) {
		super();
		this.booth = booth;
		this.toll = toll;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		booth.Vehicle2();
		toll.Vehicle2();
	}
}
