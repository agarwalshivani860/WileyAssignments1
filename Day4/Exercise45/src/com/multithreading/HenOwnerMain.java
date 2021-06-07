package com.multithreading;

public class HenOwnerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Selling seller=new Selling();
Thread hen=new Thread(new Hen(seller));
Thread owner=new Thread(new Owner(seller));
hen.start();
owner.start();

	}

}
