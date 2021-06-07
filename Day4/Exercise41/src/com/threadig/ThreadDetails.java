package com.threadig;

public class ThreadDetails {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Thread thread1=new Thread();
		Thread thread2=new Thread();
		Thread thread3=new Thread();
		Thread thread4=new Thread();
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		for(int i=0;i<5;i++)
		{System.out.println("Id "+"  Name"+"    AliveStatus"+"   State"+"   Priority");
			System.out.println(thread1.getId()+"  "+thread1.getName()+"    "+thread1.isAlive()+"   "+thread1.getState()+"  "+thread1.getPriority());
			System.out.println(thread2.getId()+"  "+thread2.getName()+"    "+thread2.isAlive()+"   "+thread2.getState()+"  "+thread2.getPriority());
			System.out.println(thread3.getId()+"  "+thread3.getName()+"    "+thread3.isAlive()+"   "+thread3.getState()+"  "+thread3.getPriority());
			System.out.println(thread4.getId()+"  "+thread4.getName()+"    "+thread4.isAlive()+"   "+thread4.getState()+"  "+thread4.getPriority());
			System.out.println();
			Thread.sleep(10000);
		}
		
//		thread1.join();
//		thread2.join();
//		thread3.join();
//		thread4.join();
//		

	}

}
