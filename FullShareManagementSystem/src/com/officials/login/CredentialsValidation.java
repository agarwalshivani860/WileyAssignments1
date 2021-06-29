package com.officials.login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.helper.MySQLConnection;


public class CredentialsValidation extends BrokersLogin implements Validate  {

int flagid=0,flagpass=0;
@Override
public boolean check() throws ClassNotFoundException, SQLException {
	Connection connection = MySQLConnection.getConnection();

	PreparedStatement statement = connection.prepareStatement("select * from sharelogs where loginid="+getBrokerId());


	ResultSet resultset = statement.executeQuery();
      
		while(resultset.next())
		{
			
			 setDesig(resultset.getString("designation"));
			return true;
		
		}
		
	

	connection.close();

    	return false;
	
}

}
