package com.share.service;

import java.sql.SQLException;

public interface ShareHolderService {
//void search();
//void checkAvailability();
//void buyStocks();
//void updateDetails();
	void viewdetails(int holderid);
	void viewStocks();
	void buyStock(int sid,double quantity) throws ClassNotFoundException, SQLException;
	void updateStock(int stockidPurchased,double quantityBought);
	
}
