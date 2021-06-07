package com.practice;

public class TockJob implements Runnable{
	 private Clock clock=new Clock();
	     
		public TockJob(Clock cl) {
			
			clock = cl;
		}

		@Override
		public void run() {
			// TODO Auto-generated method stub
			for(int i=1;i<=60;i++)
			{
				clock.tock(i);
			}
}
}
