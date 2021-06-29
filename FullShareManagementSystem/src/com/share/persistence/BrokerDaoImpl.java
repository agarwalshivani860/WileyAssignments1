package com.share.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.helper.MySQLConnection;


public class BrokerDaoImpl implements BrokerDao {

	@Override
	public void showListOfTransactions() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		//make transaction table and just display
		Connection connection = MySQLConnection.getConnection();

		PreparedStatement statement = connection.prepareStatement("select * from transaction");
		ResultSet resultset = statement.executeQuery();

		while (resultset.next()) {
          System.out.println("Transaction id: "+resultset.getInt("tid"));			
          System.out.println("Stock id: "+resultset.getInt("stockId"));	
          System.out.println("Broker's id: "+resultset.getInt("bid"));	
          System.out.println("Toatal Price "+ resultset.getLong("total_price"));	
          System.out.println("Quantity "+resultset.getLong("quantity"));	
			
		}

		connection.close();
	  
		
		
	}

}
