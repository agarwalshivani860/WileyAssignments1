package com.share.presentation;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.share.persistence.CompanyDaoImpl;
import com.share.service.CompanyServiceImpl;

public class CompanyPresentationImpl implements CompanyPresentation{

	@Override
	public void companymenu() {
		// TODO Auto-generated method stub
		System.out.println("1. Display Shares");
		System.out.println("2. Exit");
	}

	@Override
	public void performcomapnymenu(int choice) throws ClassNotFoundException, SQLException {
		switch(choice)
		{
		case 1://company's share
			Scanner sc=new Scanner(System.in);
			System.out.println("enter your company id");
			int cid=sc.nextInt();
			CompanyServiceImpl cservice=new CompanyServiceImpl();
			cservice.companyShares(cid);
			break;
		case 2: System.exit(0);
		}
		
	}

	@Override
	public ArrayList<Integer> getStock(int sid) throws ClassNotFoundException, SQLException {
		ArrayList<Integer> list=new ArrayList<Integer>();
		//get it from service layer that gets from dao layer
		CompanyServiceImpl cdao=new CompanyServiceImpl();
		ArrayList<Integer> tofetch=cdao.toGetPriceQuantity(sid);
		int price=tofetch.get(0);
		int qty=tofetch.get(1);
	
		list.add(price);
		list.add(qty);
		return list;
	}

	@Override
	public void updateCompanyStocks(int stid,int qty) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		//updatestocks from company service
		CompanyServiceImpl cpi=new CompanyServiceImpl();
		cpi.autoUpdateStocks(stid,qty);
		
		
	}

	@Override
	public void showStock() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		//getstocks MADE AVAILABLE in the market from service layer that gets from dao layer
		CompanyServiceImpl cpi=new CompanyServiceImpl();
		cpi.generateStocks();
		
	}

}
