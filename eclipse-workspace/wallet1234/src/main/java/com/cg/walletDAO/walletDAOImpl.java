package com.cg.walletDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.cg.utility.DBConn;
import com.cg.walletbean.walletuser;

public class walletDAOImpl implements walletDAO {
	int balance=0;
	Connection con=DBConn.getConnection();
	@Override
	public String insertuser(walletuser user) {
		
		// TODO Auto-generated method stub
		try {
			PreparedStatement ps=con.prepareStatement("insert into walletdb values(?,?,?)");
			ps.setString(1, user.getWalletId());
			ps.setString(2, user.getUserName());
			ps.setString(3, user.getUserAccessCode());
			
			int s=ps.executeUpdate();
			if(s>0) 
				return "User created! ";
			else
				return "User Not Created!";
			
			
		}
		catch(SQLException e){
			e.printStackTrace();
			return "user not created";
		}
		
		
	}
    @Override
	public String deposit(int amount) {
		// TODO Auto-generated method stub
    	
    	try {
			if (amount!=0) {
			    balance=balance+amount;
			    System.out.println(balance);
			    return "successful";
			}
		    else
		    	return "Not successful";
				
			
    	}
			catch(Exception e) {
				return "Amount not successfully deposited";
			}
		
    	
    	
		
	
	}

	public String withdraw(int amount) {
		// TODO Auto-generated method stub
		
    	try {
			if (amount!=0) {
			    balance=balance-amount;
			    System.out.println(balance);
			    return "successful";
			}
		    else
		    	return "Not successful";
				
			
    	}
			catch(Exception e) {
				return "Not able to withdraw amount";
			}
    
		
    	
    	
	    
	}
	public String transaction(int amount) {
		try {
			if(amount!=0) {
				balance=balance-amount;
				System.out.println(balance);
				return "successful";
			}
			else {
				return "Not successful";
			}
		}
		catch(Exception e) {
			return "Not able to transact";
		}
		
	}
	}

	

