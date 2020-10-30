package com.cg.apps.repository;

import com.cg.apps.entities.Customer;

public interface CustomerRepository 
{
	Customer addCustomer(Customer customer);
	Customer updateCustomer(Customer customer);
	Customer findById(Long id);
}
