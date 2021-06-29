package com.share.presentation;

import java.sql.SQLException;
import java.util.List;

import com.officials.login.BrokersLogin;
import com.share.bean.Brokers;
import com.share.service.BrokersServiceImpl;

public class BrokersPresentationImpl implements BrokersPresentation {
	BrokersLogin broker=new BrokersLogin();

//	@Override
//	public void viewShareHoldersDetails() {
//		// TODO Auto-generated method stub
//		System.out.println("Hey ShareHoder "+broker.getBrokerId());
//		System.out.println("List Of transactions: ");
//		
//	}
//
//	@Override
//	public void viewCompanysDetails() {
//		System.out.println("Company List: ");
//		System.out.println("");
//		
//	}

	@Override
	public void brokersmenu() {
		System.out.println("1. View Transaction Details");
		System.out.println("2. Exit");
		
	}


	@Override
	public void performbrokersmenu(int choice) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		switch(choice)
		{
		case 1:BrokersServiceImpl bsa=new BrokersServiceImpl();
				bsa.showTransactionHistory();
			break;
		case 2:System.exit(0);
		}
		
	}


	@Override
	public boolean doTransaction(int sid,double qty) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		//call transaction from service layer
		//get that stock from company add brokerage value and display to shareholder-->to be done in service layer
		BrokersServiceImpl toTransact=new BrokersServiceImpl();
		
		if(toTransact.calcTotalAmount(sid, qty)>0){
			CompanyPresentationImpl cpi=new CompanyPresentationImpl();
			cpi.updateCompanyStocks(sid,qty);
			return true;
		}
			
		
		return false;
	}

}
