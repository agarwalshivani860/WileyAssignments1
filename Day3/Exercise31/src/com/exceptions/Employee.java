package com.exceptions;

import java.util.Scanner;
import java.util.TreeMap;

public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
			NameAgeInput nai = new NameAgeInput();
			TreeMap<String, Integer> emp = new TreeMap<String, Integer>();

			while (true) {
				try {
				EmployeeMenu emenu = new EmployeeMenu();
				System.out.println("Enter Choice");
				int ch = sc.nextInt();
				switch (ch) {
				case 1:
					System.out.println("Enter name");
					String name = sc.next();
					nai.setName(name);
					System.out.println("Enter age");
					int age = sc.nextInt();

					nai.setAge(age);
					emp.put(nai.getName(), nai.getAge());
					break;
				case 2:
					System.out.println(emp);
					break;
				case 3:
					System.exit(0);

				}

			}
				catch (NameExistsUnCheckedException nameException) {
					System.out.println("Employee name exists");
				} catch (AgeUncheckedException exception) {
					System.out.println("Check age again");
				} 

		} 

	}

}
