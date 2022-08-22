package com.pluralsight.service;

import java.util.List;

import com.pluralsightrepositry.CustomerRepository;
import com.pluralsightrepositry.HibernateCusRepImpl;
import com.pluralsightspring.model.Customer;

public class CustomerServiceImpl implements CustomerService {
  private CustomerRepository customerRep =new HibernateCusRepImpl();
  //business logic in service layyer
  
  @Override
public List<Customer> findAll()
  {
	  return customerRep.findAll();
  }
}
