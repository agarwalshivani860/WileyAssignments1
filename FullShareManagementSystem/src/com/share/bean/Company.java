package com.share.bean;

public class Company {
	private int CompanyId;
	private String CompanyName;
	private long NumberOfShares;
	private int MarketValueOfShare;
	public int getCompanyId() {
		return CompanyId;
	}
	public void setCompanyId(int companyId) {
		CompanyId = companyId;
	}
	public String getCompanyName() {
		return CompanyName;
	}
	public void setCompanyName(String companyName) {
		CompanyName = companyName;
	}
	public long getNumberOfShares() {
		return NumberOfShares;
	}
	public void setNumberOfShares(long numberOfShares) {
		NumberOfShares = numberOfShares;
	}
	public int getMarketValueOfShare() {
		return MarketValueOfShare;
	}
	public void setMarketValueOfShare(int marketValueOfShare) {
		MarketValueOfShare = marketValueOfShare;
	}
}
