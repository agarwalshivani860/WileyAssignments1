package com.exs;

import java.util.Scanner;

import com.exe2.Standard;
import com.exe2.Student;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Total No of Students : ");
		int total=sc.nextInt();
		Standard standard=new Standard(total);
		
		for(int index=0;index<total;index++) {
			System.out.println("Enter Student name : ");
			String name=sc.next();
			System.out.println("Enter Marks in English");
			int marksEng=sc.nextInt();
			System.out.println("Enter Marks in Science");
			int marksSci=sc.nextInt();
			System.out.println("Enter Marks in Maths");
			int marksMaths=sc.nextInt();
			
			Student st=new Student(index, name, marksEng, marksMaths, marksSci);
			
			standard.addStudent(st);
		}

		for(int index=0;index<total;index++) {
			Student st=standard.getStudent(index);
			System.out.println(st);
		}
		

	}

}
