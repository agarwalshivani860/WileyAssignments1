package com.BankImpl;

import com.bank.CreditInterest;
import com.bank.DepositAcc;

public class FDAcc implements DepositAcc,CreditInterest {

	@Override
	public void withdraw() {
		// TODO Auto-generated method stub
		System.out.println("Amount Withdrawn from FD acc");
		
	}

	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		System.out.println("Amount Deposited for FD");
		
	}

	@Override
	public void getBalance() {
		// TODO Auto-generated method stub
		System.out.println("Here is your Balance of FD");
		
	}

	@Override
	public void addMonthlyInt() {
		// TODO Auto-generated method stub
		System.out.println("Add Monthly Amount for FD");
		
	}

	@Override
	public void addHalfYrlyInt() {
		// TODO Auto-generated method stub
		System.out.println("Add Half Yearly Amount for FD");
	}

	@Override
	public void addAnnualInt() {
		// TODO Auto-generated method stub
		System.out.println("Add Annual Amount for FD");
		
	}

}
