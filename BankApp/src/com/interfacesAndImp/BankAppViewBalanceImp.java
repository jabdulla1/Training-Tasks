package com.interfacesAndImp;

import com.objects.Customer;

public class BankAppViewBalanceImp implements BankAppViewBalance {

	@Override
	public void ViewBalance(Customer customer) {
		// TODO Auto-generated method stub
		
		System.out.println("---------------------------");
		System.out.println("Your Balance: "+ customer.getAccountBalance());
		System.out.println("---------------------------");
		
	}

}
