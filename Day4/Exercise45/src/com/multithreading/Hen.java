package com.multithreading;

public class Hen implements Runnable {
	private Selling buy=new Selling();

	public Hen(Selling sell) {
		super();
		this.buy = sell;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int i=1;
		while(buy.getPrice()<100)
		{
			buy.henLaid(i);
			i++;
		}
		
	}
	

}
