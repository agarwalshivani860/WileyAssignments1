package com.share.presentation;

import java.sql.SQLException;

public interface ShareHolderPresentation {
//	void showPortfolio();
	void mainMenu();
	void performmenu(int choice) throws ClassNotFoundException, SQLException;
}
