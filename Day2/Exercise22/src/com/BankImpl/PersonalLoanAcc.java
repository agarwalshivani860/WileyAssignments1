package com.BankImpl;

import com.bank.DebitInterest;
import com.bank.LoanAcc;

public class PersonalLoanAcc implements LoanAcc,DebitInterest {

	@Override
	public void deductMonthlyInt() {
		// TODO Auto-generated method stub
		System.out.println("deduct monthly amount for personalLoanAcc");
		
	}

	@Override
	public void deductHalfYrlyInt() {
		// TODO Auto-generated method stub
		System.out.println("deduct half yearly amount for personalLoanAcc");
		
	}

	@Override
	public void deductAnnualInt() {
		// TODO Auto-generated method stub
		System.out.println("Deduct Annual Amount for personalLoan acc");
		
	}

	@Override
	public void repayPrincipal() {
		// TODO Auto-generated method stub
		System.out.println("Repay principal amount for personalLoan acc");
		
	}

	@Override
	public void payInterest() {
		// TODO Auto-generated method stub
		System.out.println("Interest due for PersonalLoanAcc");
		
	}

	@Override
	public void payPartialPrincipal() {
		// TODO Auto-generated method stub
		System.out.println("Partial payment for PersonalLoanAcc");
		
	}

}
