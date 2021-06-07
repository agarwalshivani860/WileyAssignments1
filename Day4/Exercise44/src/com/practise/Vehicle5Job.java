package com.practise;

public class Vehicle5Job implements Runnable{
	private Booth booth=new Booth();
	private Toll toll=new Toll();
	public Vehicle5Job(Booth booth, Toll toll) {
		super();
		this.booth = booth;
		this.toll = toll;
	}
	@Override
	public void run() {
		booth.Vehicle5();
		toll.Vehicle5();
	}
}
