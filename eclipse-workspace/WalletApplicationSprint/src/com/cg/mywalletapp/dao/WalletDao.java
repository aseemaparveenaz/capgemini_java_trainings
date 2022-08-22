package com.cg.mywalletapp.dao;

import java.sql.SQLException;

import com.cg.walletapp.beans.Customer;

public interface WalletDao {

public boolean save(Customer customer);
	public Customer findOne(String mobileNo);
	
	
}
