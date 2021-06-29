package com.share.persistence;

import java.sql.SQLException;
import java.util.ArrayList;

public interface companyDao {
	void sharesAavailable(int cid) throws ClassNotFoundException, SQLException;
	boolean updateTotalShares(int sid,double qty ) throws ClassNotFoundException, SQLException;
	ArrayList<Double> getPriceQuantity(int stkid) throws ClassNotFoundException, SQLException;
	void shareStocks();
}
