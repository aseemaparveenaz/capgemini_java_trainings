package com.cg.DAOWall;

import java.util.HashMap;
import java.util.Map;

import com.cg.beanwall.walletInfo;

public class WalletDaoImpl implements WalletDao{
	int balance=0;
	Map<Integer,walletInfo> Map = new HashMap<Integer,walletInfo>();
	@Override
	public String insertuser (walletInfo user) {
		return "user info";
	}
	
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
