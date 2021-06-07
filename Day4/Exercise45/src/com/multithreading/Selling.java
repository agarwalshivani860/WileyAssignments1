package com.multithreading;

public class Selling {
	private boolean flag=true;
	private int price=0;
	


	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	synchronized void henLaid(int counter) {
		if(flag==false) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Hen Laid the Egg – "+counter);
		flag=false;
		notify();
	}
	
	synchronized void ownerGained(int counter) {
		if(flag==true) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Owner gained Rs "+counter );
		flag=true;
		notify();
	}
}
