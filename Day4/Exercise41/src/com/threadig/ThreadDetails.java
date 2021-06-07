 package com.threadig;

public class ThreadDetails {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WorkingThread thread1=new WorkingThread();
		WorkingThread thread2=new WorkingThread();
		WorkingThread thread3=new WorkingThread();
		WorkingThread thread4=new WorkingThread();
		thread1.start();
		thread1.join();
		thread2.start();
		thread2.join();
		thread3.start();
		thread3.join();
		thread4.start();	
		
	

	}

}
