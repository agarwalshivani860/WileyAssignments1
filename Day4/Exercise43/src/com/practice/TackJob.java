package com.practice;

public class TackJob implements Runnable {
	  private Clock clock=new Clock();
	     
		public TackJob(Clock cl) {
			
			clock = cl;
		}

		@Override
		public void run() {
			// TODO Auto-generated method stub
			for(int i=1;i<=60;i++)
			{
				clock.tack(i);
			}
}
}
