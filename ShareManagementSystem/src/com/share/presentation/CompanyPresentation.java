package com.share.presentation;

import java.sql.SQLException;
import java.util.ArrayList;

public interface CompanyPresentation {
//long getTotalShares();
//void displaySharePrice();
void companymenu();
void performcomapnymenu(int choice) throws ClassNotFoundException, SQLException;
void showStock() throws ClassNotFoundException, SQLException;  
ArrayList<Integer> getStock(int sid) throws ClassNotFoundException, SQLException;
void updateCompanyStocks(int stid,int quantity) throws ClassNotFoundException, SQLException;
}
