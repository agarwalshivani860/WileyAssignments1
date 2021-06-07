package com.practice;

public class TickJob implements Runnable {
    private Clock clock=new Clock();
     
	public TickJob(Clock c) {
		
		clock = c;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<=60;i++)
		{
			clock.tick(i);
		}
	}

}
