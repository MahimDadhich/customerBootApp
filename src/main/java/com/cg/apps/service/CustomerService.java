package com.cg.apps.service;

import com.cg.apps.entities.*;

public interface CustomerService 
{
	Customer register(Customer customer);
	Customer updateName(Long id, String name);
}
