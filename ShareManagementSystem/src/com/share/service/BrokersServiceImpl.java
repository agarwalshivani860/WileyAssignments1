package com.share.service;

import java.sql.SQLException;
import java.util.List;

import com.share.bean.Brokers;
import com.share.persistence.BrokerDaoImpl;
import com.share.presentation.CompanyPresentationImpl;

public class BrokersServiceImpl implements BrokersService {

	

	@Override
	public double calcTotalAmount(int sid, double qty) {
		// TODO Auto-generated method stub
		Brokers brokerValue=new Brokers();
		CompanyPresentationImpl cpi=new CompanyPresentationImpl();
		List<Integer> details=cpi.getStock(sid);
		double priceOfStock=details.get(1)+brokerValue.getSharePercent();
		double quantityPurcahsed=details.get(2)-qty;
		return quantityPurcahsed;
	}

	@Override
	public void showTransactionHistory() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		BrokerDaoImpl bdao=new BrokerDaoImpl();
		bdao.showListOfTransactions();
	}

}
