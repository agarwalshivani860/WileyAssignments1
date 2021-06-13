package com.share.presentation;

import java.sql.SQLException;
import java.util.ArrayList;

public interface CompanyPresentation {
//long getTotalShares();
//void displaySharePrice();
void companymenu();
void performcomapnymenu(int choice);
void showStock();  
ArrayList<Integer> getStock(int sid);
void updateCompanyStocks(int stid,double quantity) throws ClassNotFoundException, SQLException;
}
