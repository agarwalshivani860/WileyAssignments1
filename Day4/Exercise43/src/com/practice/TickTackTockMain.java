package com.practice;

public class TickTackTockMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Clock clk=new Clock();
		Thread tick=new Thread(new TickJob (clk));
		Thread tack=new Thread(new TackJob(clk));
		Thread tock=new Thread(new TockJob(clk));
		tick.start();
		tack.start();
		tock.start();

	}

}
