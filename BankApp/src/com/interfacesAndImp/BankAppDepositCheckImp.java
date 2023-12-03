package com.interfacesAndImp;

import com.objects.Customer;

public class BankAppDepositCheckImp implements BankAppDepositCheck {

public Customer DepositCheck(Customer customer, double cash) {
		
		customer.setAccountBalance(customer.getAccountBalance() + cash);
		
		System.out.println("---------------------------");
		System.out.println("Check Deposit Amount: "+ cash);
		System.out.println("Your New Balance: "+ customer.getAccountBalance());
		System.out.println("---------------------------");
		
		return customer; 
				
	}
	
}
