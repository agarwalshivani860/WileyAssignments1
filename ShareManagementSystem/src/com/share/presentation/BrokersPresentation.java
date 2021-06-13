package com.share.presentation;

import java.sql.SQLException;

public interface BrokersPresentation {
//	void viewShareHoldersDetails();
//	void viewCompanysDetails();
    void brokersmenu();
    void performbrokersmenu(int choice) throws ClassNotFoundException, SQLException;
    boolean doTransaction(int sid,double qty) throws ClassNotFoundException, SQLException;
}
