package com.java.lesson4.assignment2.Concrete;

import com.java.lesson4.assignment2.Abstract.BaseCustomerManager;
import com.java.lesson4.assignment2.Abstract.ICustomerCheckService;
import com.java.lesson4.assignment2.Entities.Customer;

public class NeroCustomerManager extends BaseCustomerManager{
	
	private ICustomerCheckService customerCheckService;
	
	public NeroCustomerManager(ICustomerCheckService customerCheckService) {
		this.customerCheckService=customerCheckService;
	}
	
	@Override
	public void Save(Customer customer)  {
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
