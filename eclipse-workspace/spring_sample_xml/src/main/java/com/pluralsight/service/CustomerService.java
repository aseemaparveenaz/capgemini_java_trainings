package com.pluralsight.service;

import java.util.List;

import com.pluralsightspring.model.Customer;

public interface CustomerService {

	List<Customer> findAll();

}