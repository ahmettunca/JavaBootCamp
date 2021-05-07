package com.java.lesson4.assignment2.Adapters;

import java.rmi.RemoteException;

import com.java.lesson4.assignment2.Abstract.ICustomerCheckService;
import com.java.lesson4.assignment2.Entities.Customer;
import com.java.lesson4.assignment2.mernisReference.KPSPublicSoap;
import com.java.lesson4.assignment2.mernisReference.KPSPublicSoapProxy;

public class MernisServiceAdapter implements ICustomerCheckService{

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		
		KPSPublicSoap client = new KPSPublicSoapProxy();
		try {
			return client.TCKimlikNoDogrula(Long.valueOf(customer.getNaionalityId()), customer.getFirstname().toUpperCase(), 
					customer.getLastName().toUpperCase(), customer.getDateOfBirth().getYear());
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return false;
	}

}
