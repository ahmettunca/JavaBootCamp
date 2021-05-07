package com.java.lesson4.assignment2.Concrete;

import com.java.lesson4.assignment2.Abstract.ICustomerCheckService;
import com.java.lesson4.assignment2.Abstract.ICustomerService;
import com.java.lesson4.assignment2.Entities.Customer;
import com.java.lesson4.assignment2.mernisReference.KPSPublicSoap;

public class CustomerCheckManager implements ICustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		
		return true;
	}

	
}
