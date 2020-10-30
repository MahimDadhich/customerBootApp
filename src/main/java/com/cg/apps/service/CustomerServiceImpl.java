package com.cg.apps.service;

import com.cg.apps.entities.*;
import com.cg.apps.repository.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;


@Transactional
@Service
public class CustomerServiceImpl implements CustomerService
{
    private static final Logger Log= LoggerFactory.getLogger(CustomerServiceImpl.class);
	@Autowired
	private CustomerRepository customerRepo;

	@Override
	public Customer register(Customer customer) 
	{
		customer=customerRepo.addCustomer(customer);
		return customer;
	}

	@Override
	public Customer updateName(Long id, String name) 
	{
		Customer customer = customerRepo.findById(id);
		customer.setName(name);
		customer = customerRepo.updateCustomer(customer);
		return customer;
	}

}
