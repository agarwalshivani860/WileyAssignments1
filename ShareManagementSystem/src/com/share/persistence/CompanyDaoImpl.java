package com.share.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.helper.MySQLConnection;
import com.officials.login.BrokersLogin;

public class CompanyDaoImpl implements companyDao{

	@Override
	public boolean updateTotalShares(int sid,int qty) throws ClassNotFoundException, SQLException {
		Connection connection = MySQLConnection.getConnection();
		int currentQuantity=(getPriceQuantity(sid).get(1));
		PreparedStatement statement = connection.prepareStatement("Update Stocks set stockqty="+(currentQuantity-qty/2)+" where stockid="+sid);

		int rows = statement.executeUpdate();

		if (rows > 0)
			return true;

		connection.close();

		return false;
		
	}
	@Override
	public ArrayList<Integer> getPriceQuantity(int stkid) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		ArrayList<Integer> priceQuantity=new ArrayList<Integer>();
		Connection connection = MySQLConnection.getConnection();
		PreparedStatement statement = connection.prepareStatement("Select stockprice,stockqty from Stocks where stockid="+stkid);
		ResultSet resultset = statement.executeQuery();
		if(resultset.next()){
	    priceQuantity.add(resultset.getInt("stockprice"));
	    priceQuantity.add( resultset.getInt("stockqty"));
		}
	    
		
		//int price=Integer.parseInt(answer.split(" ")[0]);
		//fetch price and quantity of specified stkid and add in arraylist first price then qty and return
		
		return priceQuantity;
	}

	@Override
	public void shareStocks() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		//select few stocks from total stocks add in separate table or through where if from 1 table
		//give it in the market i.e to brokers
		Connection connection = MySQLConnection.getConnection();
		PreparedStatement statement = connection.prepareStatement("Select * from Stocks");
		ResultSet resultset=statement.executeQuery();
		while(resultset.next()) {
			System.out.println("Stock id: "+resultset.getInt("stockid"));
			System.out.println("Stock Name: "+resultset.getString("stockname"));
			System.out.println("Stock Price: "+resultset.getInt("stockprice"));
			System.out.println("Stock Quantity: "+resultset.getInt("stockqty"));
		}
	}

	@Override
	public void sharesAavailable(int cid) throws ClassNotFoundException, SQLException {
		Connection connection = MySQLConnection.getConnection();
		PreparedStatement statement = connection.prepareStatement("Select * from Stocks where stockid="+cid);
		ResultSet resultset=statement.executeQuery();
		while(resultset.next()) {
			System.out.println("Stock id: "+resultset.getInt("stockid"));
			System.out.println("Stock Name: "+resultset.getString("stockname"));
			System.out.println("Stock Price: "+resultset.getInt("stockprice"));
			System.out.println("Stock Quantity: "+resultset.getInt("stockqty"));
		}
		//select and display data form stock tables acc to cid
		
	}

}
