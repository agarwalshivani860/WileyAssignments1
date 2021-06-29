package com.share.service;

import java.sql.SQLException;
import java.util.ArrayList;

import com.share.persistence.CompanyDaoImpl;

public class CompanyServiceImpl implements CompanyService {

	@Override
	public void autoUpdateStocks(int sid,double qty) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		//this is company stock update-->go to company dao layer
		CompanyDaoImpl cdao=new CompanyDaoImpl();
		cdao.updateTotalShares(sid, qty);
	}

	@Override
	public ArrayList<Double> toGetPriceQuantity(int stockid) throws ClassNotFoundException, SQLException  {
		// TODO Auto-generated method stub
		CompanyDaoImpl cdao= new CompanyDaoImpl();
		return cdao.getPriceQuantity(stockid);
	}

	@Override
	public void generateStocks() {
		// TODO Auto-generated method stub
		CompanyDaoImpl cdao=new CompanyDaoImpl();
		cdao.shareStocks();
		
	}

	@Override
	public void companyShares(int companyid) throws ClassNotFoundException, SQLException {
		CompanyDaoImpl cdao = null;
		try {
			cdao = new CompanyDaoImpl();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		cdao.sharesAavailable(companyid);
		
	}

}
