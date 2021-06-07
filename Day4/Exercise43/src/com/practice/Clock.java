package com.practice;

public class Clock {
	
	private int counter=0;
	synchronized void tick(int tickId) {
		while(counter!=0) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.print("tick"+tickId);
		counter=1;
		notifyAll();
	}
	
	synchronized void tack(int tackId) {
		while(counter!=1) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.print("tack"+tackId);
		counter=2;
		notifyAll();
	}
	synchronized void tock(int tockId)
	{
		while(counter!=2) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.print("tock"+tockId);
		System.out.println();
		counter=0;
		notifyAll();
		
	}
}
