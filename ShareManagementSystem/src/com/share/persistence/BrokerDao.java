package com.share.persistence;

import java.sql.SQLException;

public interface BrokerDao {
void showListOfTransactions() throws ClassNotFoundException, SQLException;

}
