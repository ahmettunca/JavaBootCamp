package com.java.lesson4.assignment2.Abstract;

import com.java.lesson4.assignment2.Entities.Customer;

public abstract class BaseCustomerManager implements ICustomerService {

	@Override
	public void Save(Customer customer)  {
		System.out.println("Veri tabanýna kaydedildi. "+customer.getFirstname());
		
	}

}
