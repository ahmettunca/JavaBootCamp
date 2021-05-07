package com.java.lesson4.assignment2.Concrete;

import com.java.lesson4.assignment2.Abstract.BaseCustomerManager;
import com.java.lesson4.assignment2.Abstract.ICustomerCheckService;
import com.java.lesson4.assignment2.Entities.Customer;



public class StarbucksCustomerManager extends BaseCustomerManager  {
	

	private ICustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager(ICustomerCheckService customerCheckService) {
		this.customerCheckService=customerCheckService;
	}

	@Override
	public void Save(Customer customer){
		
		try {
			if(customerCheckService.CheckIfRealPerson(customer)) 
				super.Save(customer);
			else
				System.out.println("person is not valid");
				
		} catch (Exception e) {	
			e.printStackTrace();
		}
		
		
		
	}
	

	
}
