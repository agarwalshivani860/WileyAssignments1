package com.practise;


public class BoothTollMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Booth booth=new Booth();
		Toll toll=new Toll();
		Thread Vehicle1=new Thread(new Vehicle1Job(booth, toll));
		Thread Vehicle2=new Thread(new Vehicle2Job(booth, toll));
		Thread Vehicle3=new Thread(new Vehicle3Job(booth, toll));
		Thread Vehicle4=new Thread(new Vehicle4Job(booth, toll));
		Thread Vehicle5=new Thread(new Vehicle5Job(booth, toll));
		Vehicle1.start();
		Vehicle2.start();
		Vehicle3.start();
		Vehicle4.start();
		Vehicle5.start();
	}

}
