package com.share.bean;

public class ShareHolder {
	private int FolioNumber;
	private String ShareHolderName;
	public ShareHolder(int folioNumber, String shareHolderName) {
		super();
		FolioNumber = folioNumber;
		ShareHolderName = shareHolderName;
	}
	public int getFolioNumber() {
		return FolioNumber;
	}
	public void setFolioNumber(int folioNumber) {
		FolioNumber = folioNumber;
	}
	public String getShareHolderName() {
		return ShareHolderName;
	}
	public void setShareHolderName(String shareHolderName) {
		ShareHolderName = shareHolderName;
	}
	@Override
	public String toString() {
		return "ShareHolder [FolioNumber=" + FolioNumber + ", ShareHolderName=" + ShareHolderName + "]";
	}
}
