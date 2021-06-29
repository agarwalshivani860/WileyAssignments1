package com.share.service;

import java.sql.SQLException;
import java.util.ArrayList;

public interface CompanyService {
void companyShares(int companyid) throws ClassNotFoundException, SQLException;
void autoUpdateStocks(int sid,double qty) throws ClassNotFoundException, SQLException;
ArrayList<Double> toGetPriceQuantity(int stockid) throws ClassNotFoundException, SQLException  ;
void generateStocks();

}
