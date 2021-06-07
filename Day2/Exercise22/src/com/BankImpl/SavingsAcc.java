package com.BankImpl;

import com.bank.CreditInterest;
import com.bank.DepositAcc;

public class SavingsAcc implements DepositAcc,CreditInterest {

	@Override
	public void addMonthlyInt() {
		// TODO Auto-generated method stub
		System.out.println("Add Monthly Amount for CreditInterest");
		
	}

	@Override
	public void addHalfYrlyInt() {
		// TODO Auto-generated method stub
		System.out.println("Add Half Yearly Amount for CreditInterest");
		
	}

	@Override
	public void addAnnualInt() {
		// TODO Auto-generated method stub
		System.out.println("Add Annual Amount for CreditInterest");
		
	}

	@Override
	public void withdraw() {
		// TODO Auto-generated method stub
		System.out.println("Amount Withdrawn from CreditInterest");
		
	}

	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		System.out.println("Deposit for CreditInterest");
		
	}

	@Override
	public void getBalance() {
		// TODO Auto-generated method stub
		System.out.println("Showing balance for CreditInterest");
	}

}
