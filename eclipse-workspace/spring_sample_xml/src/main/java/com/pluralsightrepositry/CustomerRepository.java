package com.pluralsightrepositry;

import java.util.List;

import com.pluralsightspring.model.Customer;

public interface CustomerRepository {

	List<Customer> findAll();

}