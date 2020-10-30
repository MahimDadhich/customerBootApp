package com.cg.apps.ui;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.cg.apps.entities.*;
import com.cg.apps.service.*;

@Component
public class ProjectUI 
{		
		@Autowired
		private CustomerService customerService;

		public void runUI()
		{
			Customer customerObj1 = addObj(1L, "Harshit");
			Customer customerObj2 = addObj(2L, "Shivam");
			Customer customerObj3= addObj(3L, "Riya");
			
			System.out.println("Customer 1: "+customerObj1+"\nCustomer 2: "+customerObj2+"\nCustomer 3: "+customerObj3);

			Long idUpdate = customerObj1.getId();	
			customerObj1 = updateObj(idUpdate, "Naman");
			System.out.println("Customer 1: "+customerObj1);
			
		}
		
		public Customer addObj(Long id, String name)
		{
			Customer customer = new Customer(id, name);
			customer = customerService.register(customer);
			return customer;
		}
		
		public Customer updateObj(Long id, String name)
		{
			return customerService.updateName(id, name);
		}
		
}

