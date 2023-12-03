package com.objects;

import java.util.ArrayList;
import java.util.List;

public class BankAppData {
	private List<Customer> customers;

	public BankAppData() {
		super();
		
		this.customers = new ArrayList<>();
		
		this.customers.add(new Customer(1001, 4, 4, 3000, "Jihad Abdul-Latif", 450006993, "asdf@asdf.com"));
		this.customers.add(new Customer(1001, 200210444, 7840, 3000, "Jihad Abdul-Latif", 450006993, "asdf@asdf.com"));
		this.customers.add(new Customer(1001, 200210444, 7840, 3000, "Jihad Abdul-Latif", 450006993, "asdf@asdf.com"));
		this.customers.add(new Customer(1001, 200210444, 7840, 3000, "Jihad Abdul-Latif", 450006993, "asdf@asdf.com"));
		this.customers.add(new Customer(1001, 200210444, 7840, 3000, "Jihad Abdul-Latif", 450006993, "asdf@asdf.com"));
		this.customers.add(new Customer(1001, 200210444, 7840, 3000, "Jihad Abdul-Latif", 450006993, "asdf@asdf.com"));
		
	}

	public BankAppData(List<Customer> customers) {
		super();
		this.customers = customers;
	}

	public List<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}

	@Override
	public String toString() {
		return "BankAppData [customers=" + customers + "]";
	}
	
	
}
