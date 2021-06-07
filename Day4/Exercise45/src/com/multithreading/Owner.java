package com.multithreading;

public class Owner implements Runnable {
private Selling sell=new Selling();

public Owner(Selling sell) {
	super();
	this.sell = sell;
}

@Override
public void run() {
	// TODO Auto-generated method stub
	int paise=0;
	while(sell.getPrice()<=100)
	{
		sell.setPrice(paise+2);
		sell.ownerGained(paise+2);
		paise=paise+2;
	}
}

}
