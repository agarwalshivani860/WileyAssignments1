package com.client;

import java.util.Scanner;

import com.records.TelephoneRecord;
import com.telephone.TelephoneDirectory;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		TelephoneRecord telephoneRecord=new TelephoneRecord();
		int flag=0;
		while(flag==0){
			int id=0;
			System.out.println("Enter name : ");
			String name=sc.next();
			System.out.println("Enter Telephone no");
			int dialnumber=sc.nextInt();
		
			id=id+1;
			TelephoneDirectory td=new TelephoneDirectory(id, name,dialnumber);
			
			telephoneRecord.addRecord(td);
			System.out.println("Want to store more record if yes enter 0 ");
			flag=sc.nextInt();
			
		}
		
		telephoneRecord.displayRecord();

	}

}
