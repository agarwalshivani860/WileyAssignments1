package com.share.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.helper.MySQLConnection;


public class BrokerDaoImpl implements BrokerDao {

	@Override
	public void showListOfTransactions() throws ClassNotFoundException, SQLException {
		//make transaction table and just display
				Connection connection = MySQLConnection.getConnection();

				PreparedStatement statement = connection.prepareStatement("select * from Transactions");
				ResultSet resultset = statement.executeQuery();

				while (resultset.next()) {
		          System.out.print("Transaction id: "+resultset.getInt("tId"));			
		          System.out.print("	Stock id: "+resultset.getInt("stockId"));	
		          System.out.print("	Broker's id: "+resultset.getInt("bid"));	
		          System.out.print("	Total Price "+ resultset.getLong("total_price"));	
		          System.out.print("	Quantity "+resultset.getLong("qty"));
		          System.out.println();
					
				}

				connection.close();
			  
		
		
	}

}
