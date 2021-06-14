package com.share.service;

import java.sql.SQLException;

import com.share.persistence.ShareHolderDaoImpl;
import com.share.presentation.BrokersPresentationImpl;
import com.share.presentation.CompanyPresentationImpl;

public class ShareHolderServiceImpl implements ShareHolderService {

	@Override
	public void viewdetails(int holderid) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		//details from daostockholder
		ShareHolderDaoImpl shdao=new ShareHolderDaoImpl();
		shdao.showShareHolderDetails(holderid);
	}

	@Override
	public void viewStocks() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		//call from companypresentation
		CompanyPresentationImpl cpi=new CompanyPresentationImpl();
		cpi.showStock();
		
		
	}

	@Override
	public void buyStock(int sid,int quantity) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		//buy stock from official according to stockid
	
	BrokersPresentationImpl toTransact=new BrokersPresentationImpl();
       if(toTransact.doTransaction(sid,quantity))
       {
    	   
    	   System.out.println("Stock purchased");
    	   //autoupdaterecords from companyPresentation
    	   CompanyPresentationImpl cpi=new CompanyPresentationImpl();
    	   cpi.updateCompanyStocks(sid,quantity);
       }
       else
       {
    	   System.out.println("Stock Unavailable");
       }
		
		
	}

	@Override
	public void updateStock(int shareholderid,int stockidPurchased,int quantityBought) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		//this methods updates stock in stockholder database that is go to dao layer
		ShareHolderDaoImpl shd=new ShareHolderDaoImpl();
		shd.updateShareHolderStocks(shareholderid,stockidPurchased,quantityBought);
		
	}

}
