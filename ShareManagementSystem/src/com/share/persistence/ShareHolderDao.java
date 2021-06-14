package com.share.persistence;

import java.sql.SQLException;

public interface ShareHolderDao {
//void updateFolio(int n);
//void updateDetails();
	void showShareHolderDetails(int shid) throws ClassNotFoundException, SQLException;
boolean updateShareHolderStocks(int shareid,int stockid,int stockqty) throws ClassNotFoundException, SQLException;
}
