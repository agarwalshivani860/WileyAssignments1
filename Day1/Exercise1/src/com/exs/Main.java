package com.exs;

import java.util.Scanner;

import com.exe1.CalculateEggUnit;
import com.exe1.EggUnit;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of Eggs: ");
		int  n=sc.nextInt();
		CalculateEggUnit calc=new CalculateEggUnit(n);
		calc.getCalculate();
		calc.setCalculate();
		calc.display();
		
	}

}
