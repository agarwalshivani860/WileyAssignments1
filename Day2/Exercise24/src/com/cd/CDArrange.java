package com.cd;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;


public class CDArrange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Set<CD> mySet = new TreeSet<CD>(new SortBySinger());
	

		while (true) {
			CDMenu emenu = new CDMenu();
			System.out.println("Enter Choice");
			int ch = sc.nextInt();
			switch (ch) {
			case 1:
				System.out.println("Enter Album title");
				String name = sc.next();
				System.out.println("Enter Singer");
				String singer = sc.next();

				
				mySet.add(new CD(name,singer));
				break;
			case 2:
				System.out.println(mySet);
				break;
			case 3:
				System.exit(0);

			}

		}
	}
}
