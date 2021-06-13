package com.share.service;

import java.sql.SQLException;

public interface BrokersService {
double calcTotalAmount(int sid,double qty);
void showTransactionHistory() throws ClassNotFoundException, SQLException;
}
