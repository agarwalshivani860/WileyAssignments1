package com.share.persistence;

public interface ShareHolderDao {
//void updateFolio(int n);
//void updateDetails();
	void showShareHolderDetails(int shid);
void updateShareHolderStocks(int stockid,double stockqty);
}
