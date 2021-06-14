package com.share.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.helper.MySQLConnection;


public class ShareHolderDaoImpl implements ShareHolderDao{

	@Override
	public boolean updateShareHolderStocks(int shareid,int stockid,int stockqty) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		//changes in database in stock qty in respect to stock id
        int changeInQty=0;
        String name="";
        Connection connection2 = MySQLConnection.getConnection();
		PreparedStatement statement2 = connection2.prepareStatement("Select * from ShareHolder where Shareholderid="+shareid);
		ResultSet resultset1=statement2.executeQuery();
		if(resultset1.next())
		{
			name=resultset1.getString("shareholdername");
		}
		connection2.close();
		Connection connection = MySQLConnection.getConnection();
		PreparedStatement statement = connection.prepareStatement("Select * from ShareHolder where shareholderheldstockid="+stockid+" and Shareholderid="+shareid);
		ResultSet resultset=statement.executeQuery();
		if(resultset.next())
		{
			changeInQty=resultset.getInt("shareholderheldstockqty");
		}
		connection.close();
		if(changeInQty==0)
		{
			Connection connection3 = MySQLConnection.getConnection();

			PreparedStatement statement3 = connection3.prepareStatement("insert into ShareHolder values(?,?,?,?,?)");
			statement3.setInt(1, shareid);
			statement3.setString(2, name);
			statement3.setInt(3, stockid);
			statement3.setInt(4,stockqty);
			statement3.setInt(5, 0);

			int rows = statement3.executeUpdate();

			if (rows > 0)
				return true;

			connection3.close();

			return false;
		}else{
		Connection connection1 = MySQLConnection.getConnection();
		System.out.println("shqty"+changeInQty);
		PreparedStatement statement1 = connection1.prepareStatement("Update ShareHolder set shareholderheldstockqty="+(changeInQty+stockqty)+ " where shareholderheldstockid="+stockid+" and Shareholderid="+shareid);

		int rows = statement1.executeUpdate();

		if (rows > 0)
			return true;

		connection1.close();

		return false;
		}
	}

	@Override
	public void showShareHolderDetails(int shid) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		//select from stockHoldertable in respect to stock holder id 
		Connection connection = MySQLConnection.getConnection();
		PreparedStatement statement = connection.prepareStatement("Select * from ShareHolder where Shareholderid="+shid);
		ResultSet resultset=statement.executeQuery();
		if(resultset.next())
		{
			System.out.println("Share Holder id: "+resultset.getInt("Shareholderid"));
			System.out.println("Share Holder Name: "+resultset.getString("shareholdername"));
			System.out.println("Stock id: "+resultset.getInt("shareholderheldstockid"));
			System.out.println("Stock Quantity: "+resultset.getLong("shareholderheldstockqty"));
			while(resultset.next()) {
//				System.out.println("Share Holder id: "+resultset.getInt("Shareholderid"));
//				System.out.println("Share Holder Name: "+resultset.getString("shareholdername"));
				System.out.println("Stock id: "+resultset.getInt("shareholderheldstockid"));
				System.out.println("Stock Quantity: "+resultset.getLong("shareholderheldstockqty"));
//				System.out.println("Stock Price: "+resultset.getInt("shardholderstockprice"));
			}
		}
	
	}

}
