package com.BankFeautures;

import com.BankImpl.FDAcc;
import com.BankImpl.HousingLoanAcc;
import com.BankImpl.PersonalLoanAcc;
import com.BankImpl.SavingsAcc;

public class MyAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FDAcc fd=new FDAcc();
		HousingLoanAcc houseloan=new HousingLoanAcc();
		PersonalLoanAcc personalloan=new PersonalLoanAcc();
		SavingsAcc savings=new SavingsAcc();
		fd.addAnnualInt();
		fd.addHalfYrlyInt();
		fd.addMonthlyInt();
		fd.deposit();
		personalloan.deductAnnualInt();
		personalloan.deductHalfYrlyInt();
		personalloan.deductMonthlyInt();
		personalloan.payInterest();
		savings.addAnnualInt();
		savings.addHalfYrlyInt();
		houseloan.deductAnnualInt();
		houseloan.deductHalfYrlyInt();

	}

}
