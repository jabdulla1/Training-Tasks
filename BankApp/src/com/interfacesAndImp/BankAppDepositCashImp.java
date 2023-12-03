package com.interfacesAndImp;

import com.objects.Customer;

public class BankAppDepositCashImp implements BankAppDepositCash {
	
	public Customer DepositCash(Customer customer, double cash) {
		
		customer.setAccountBalance(customer.getAccountBalance() + cash);
		
		System.out.println("---------------------------");
		System.out.println("Cash Deposit Amount: "+ cash);
		System.out.println("Your New Balance: "+ customer.getAccountBalance());
		System.out.println("---------------------------");
		
		return customer; 
				
	}
}
