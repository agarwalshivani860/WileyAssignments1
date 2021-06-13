package com.share.presentation;

import java.sql.SQLException;
import java.util.Scanner;

import com.share.service.ShareHolderServiceImpl;

public class ShareHolderPresentationImpl implements ShareHolderPresentation{

	@Override
	public void mainMenu() {
		System.out.println("1. View your details");
		System.out.println("2. View stocks");
		System.out.println("3. BuyStocks");
		System.out.println("4. Exit");
		
	}

	@Override
	public void performmenu(int choice) throws ClassNotFoundException, SQLException {
		Scanner sc=new Scanner(System.in);
		switch(choice)
		{
		case 1: ShareHolderServiceImpl shs=new ShareHolderServiceImpl();
		       System.out.println("Enter your id");
		       int shareholderid=sc.nextInt();
			shs.viewdetails(shareholderid);
				break;
		case 2:ShareHolderServiceImpl shsi=new ShareHolderServiceImpl();
				shsi.viewStocks();
				break;
		case 3:System.out.println("enter stock id to buy");
			int stockbuy=sc.nextInt();
			System.out.println("enter stock qty to buy");
			double stockqty=sc.nextDouble();
			ShareHolderServiceImpl shso=new ShareHolderServiceImpl();
			shso.buyStock(stockbuy, stockqty);
			shso.updateStock(stockbuy,stockqty);
			break;
		case 4: System.exit(0);
				
		}
		
	}


}
