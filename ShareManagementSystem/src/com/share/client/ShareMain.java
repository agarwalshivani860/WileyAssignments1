package com.share.client;

import java.sql.SQLException;
import java.util.Scanner;

import com.officials.login.BrokersLogin;
import com.officials.login.CredentialsValidation;
import com.share.presentation.BrokersPresentationImpl;
import com.share.presentation.CompanyPresentationImpl;
import com.share.presentation.ShareHolderPresentationImpl;

public class ShareMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Login");
		System.out.println("Enter Id");
		int id=sc.nextInt();
		System.out.println("Enter Password");
		String pass=sc.next();
		BrokersLogin blogin=new BrokersLogin();
		blogin.setBrokerId(id);
		blogin.setBrokerPassword(pass);
		
		CredentialsValidation cv=new CredentialsValidation();
		try {
			if(cv.check())
			{
				System.out.println("Welcome");
				System.out.println("Enter Designation: ");
				blogin.setDesig(sc.next());
				System.out.println("sss: "+blogin.getDesig());
				if(blogin.getDesig().equals("share"))
				{
					ShareHolderPresentationImpl shp=new ShareHolderPresentationImpl();
					while(true){
					shp.mainMenu();
					System.out.println("enter choice: ");
					int ch=sc.nextInt();
					shp.performmenu(ch,id);}
				}
				else if(blogin.getDesig()=="official")
				{
					BrokersPresentationImpl bp=new BrokersPresentationImpl();
					while(true){
					bp.brokersmenu();
					System.out.println("enter choice: ");
					int ch=sc.nextInt();
					bp.performbrokersmenu(ch);}
				}
				if(blogin.getDesig()=="company")
				{
					CompanyPresentationImpl cp=new CompanyPresentationImpl();
					while(true){
					cp.companymenu();
					System.out.println("enter choice: ");
					int ch=sc.nextInt();
					cp.performcomapnymenu(ch);}
				}
			}
			else
			{
				System.out.println("Check your password or id");
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
