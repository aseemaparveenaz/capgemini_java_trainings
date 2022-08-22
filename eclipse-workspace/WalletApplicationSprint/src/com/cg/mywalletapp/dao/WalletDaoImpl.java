package com.cg.mywalletapp.dao;

import java.util.Map;

import com.cg.walletapp.beans.Customer;

public class WalletDaoImpl implements WalletDao{

	 Map<String, Customer> data; 
	public WalletDaoImpl(Map<String, Customer> data) {
		super();
		this.data = data;
	}

	public boolean save(Customer customer) 
	{
		Customer customer1=null;
		customer1=findOne(customer.getMobileNo());
		if(customer1==null)
		{
			data.put(customer.getMobileNo(),customer);
			return true;
		}
		else
		{
			data.remove(customer1.getMobileNo());
			data.put(customer.getMobileNo(),customer);
			return true;
		}
		
	}
	public Customer findOne(String mobileNo) 
	{
	if (data.containsKey(mobileNo))
			{
		
		  return (data.get(mobileNo));
		
			}
	else {
	return null;	
	}
}}
