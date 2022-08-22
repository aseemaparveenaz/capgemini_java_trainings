package com.pluralsightrepositry;

import java.util.ArrayList;
import java.util.List;

import com.pluralsightspring.model.Customer;

public class HibernateCusRepImpl implements CustomerRepository {
	
	
	@Override
	public List<Customer> findAll()
	{
		List<Customer> customers=new ArrayList();
	    Customer customer=new Customer();
	    customer.setFname("aseema");
	    customer.setLname("parveen");
	    customers.add(customer);
	    return customers;
	    
	}

}
