package com.exs;

import java.util.Scanner;

import com.exe4.DailyWorker;
import com.exe4.SalariedWorker;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name");
		String name = sc.nextLine();
		System.out.println("Enter Rate");
		int rate = sc.nextInt();
		System.out.println("Enter Hours");
		int hours = sc.nextInt();
		
		
		
			DailyWorker dwobj = new DailyWorker(name, rate);
			dwobj.Pay(hours);
			dwobj.displaySalary();
		
			SalariedWorker swobj = new SalariedWorker(name, rate);
			swobj.Pay();
			swobj.displaySalary();
		
	}

}
