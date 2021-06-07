package com.BankImpl;

import com.bank.DebitInterest;
import com.bank.LoanAcc;

public class HousingLoanAcc implements LoanAcc,DebitInterest {

	@Override
	public void deductMonthlyInt() {
		// TODO Auto-generated method stub
		System.out.println("Monthly Amount got DEDUCTED");
		
	}

	@Override
	public void deductHalfYrlyInt() {
		// TODO Auto-generated method stub
		System.out.println("HalfYearly amount got DEDUCTED FOR HOUSINGLOANACCOUNT");
		
	}

	@Override
	public void deductAnnualInt() {
		// TODO Auto-generated method stub
		System.out.println("Annual Amount got DEDUCTED FOR HOUSINGLOANACCOUNT");
		
	}

	@Override
	public void repayPrincipal() {
		// TODO Auto-generated method stub
		System.out.println("rePAY PRINICIPLE FOR HOUSINGLOANACCOUNT");
		
	}

	@Override
	public void payInterest() {
		// TODO Auto-generated method stub
		System.out.println("INTEREST DUE FOR HOUSINGLOANACCOUNT");
		
	}

	@Override
	public void payPartialPrincipal() {
		// TODO Auto-generated method stub
		System.out.println("wOAH!! PARTIAL AMOUNT TO PAY FOR HOUSINGLOANACCOUNT");
		
	}

}
