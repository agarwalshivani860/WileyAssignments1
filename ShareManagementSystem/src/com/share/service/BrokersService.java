package com.share.service;

import java.sql.SQLException;

public interface BrokersService {
double calcTotalAmount(int sid,int qty) throws ClassNotFoundException, SQLException;
void showTransactionHistory() throws ClassNotFoundException, SQLException;
}
