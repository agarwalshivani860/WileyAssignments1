package com.share.service;

import java.sql.SQLException;

public interface ShareHolderService {
//void search();
//void checkAvailability();
//void buyStocks();
//void updateDetails();
	void viewdetails(int holderid) throws ClassNotFoundException, SQLException;
	void viewStocks() throws ClassNotFoundException, SQLException;
	void buyStock(int sid,int quantity) throws ClassNotFoundException, SQLException;
	void updateStock(int shareholderid,int stockidPurchased,int quantityBought) throws ClassNotFoundException, SQLException;
	
}
