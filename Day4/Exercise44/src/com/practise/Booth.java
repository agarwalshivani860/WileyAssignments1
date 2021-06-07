package com.practise;

public class Booth {
	
	private int counter=0;
	public int getCounter() {
		return counter;
	}


	synchronized void Vehicle1() {
		while(counter!=0) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Vehicle1 Crossed Bridge");
		counter=1;
		notifyAll();
	}
	
	synchronized void Vehicle2() {
		while(counter!=1) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Vehicle2 Crossed Bridge");
		counter=2;
		notifyAll();
	}
	synchronized void Vehicle3()
	{
		while(counter!=2) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Vehicle3 Crossed Bridge");
		
		counter=3;
		notifyAll();
		
	}
	synchronized void Vehicle4()
	{
		while(counter!=3) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Vehicle4 Crossed Bridge");
		
		counter=4;
		notifyAll();
		
	}
	synchronized void Vehicle5()
	{
		while(counter!=4) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Vehicle5 Crossed Bridge");
		System.out.println();
		counter=0;
		notifyAll();
		
	}
}
