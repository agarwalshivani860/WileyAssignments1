package com.threadig;

public class WorkingThread extends Thread{
public void run()
{
	for(int i=1;i<=5;i++)
	{
		System.out.println("Thread Id : "+Thread.currentThread().getId());
		System.out.println("Thread Name : "+Thread.currentThread().getName());
		System.out.println("Thread Alive : "+Thread.currentThread().isAlive());
		System.out.println("Thread State : "+Thread.currentThread().getState());
		System.out.println("Thread Priority : "+Thread.currentThread().getPriority());
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
}
