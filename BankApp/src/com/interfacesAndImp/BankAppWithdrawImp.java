package com.interfacesAndImp;

import com.objects.Customer;

public class BankAppWithdrawImp implements BankAppWithdraw {

	@Override
	public Customer Withdraw(Customer customer, double money) {
		// TODO Auto-generated method stub
		customer.setAccountBalance(customer.getAccountBalance() - money);
		
		System.out.println("---------------------------");
		System.out.println("Withdraw Amount: "+ money);
		System.out.println("Your New Balance: "+ customer.getAccountBalance());
		System.out.println("---------------------------");
		
		return customer; 
	}

}
