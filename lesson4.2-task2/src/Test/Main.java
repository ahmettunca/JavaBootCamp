package com.java.lesson4.assignment2.Test;


import java.time.LocalDate;
import java.util.Date;

import com.java.lesson4.assignment2.Abstract.BaseCustomerManager;
import com.java.lesson4.assignment2.Adapters.MernisServiceAdapter;
import com.java.lesson4.assignment2.Concrete.NeroCustomerManager;
import com.java.lesson4.assignment2.Concrete.StarbucksCustomerManager;
import com.java.lesson4.assignment2.Entities.Customer;

public class Main {
	public static void main(String[] args) {
		BaseCustomerManager customerManager = new NeroCustomerManager(new MernisServiceAdapter());
		customerManager.Save(new Customer(1, "Mehmet", "Çalýþkan", "21235648725", LocalDate.of(1990, 8, 12)));

	}

}
