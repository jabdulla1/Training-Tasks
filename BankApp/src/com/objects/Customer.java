package com.objects;

public class Customer {
	private long customerId;
	private long accountNumber;
	private int pinNumber;
	private double accountBalance;
	private String customerName;
	private int customerMoblie;
	private String customerEmail;
	
	
	public Customer() {
		super();
	}


	public Customer(long customerId, long accountNumber, int pinNumber, double accountBalance, String customerName,
			int customerMoblie, String customerEmail) {
		super();
		this.customerId = customerId;
		this.accountNumber = accountNumber;
		this.pinNumber = pinNumber;
		this.accountBalance = accountBalance;
		this.customerName = customerName;
		this.customerMoblie = customerMoblie;
		this.customerEmail = customerEmail;
	}


	public long getCustomerId() {
		return customerId;
	}


	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}


	public long getAccountNumber() {
		return accountNumber;
	}


	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}


	public int getPinNumber() {
		return pinNumber;
	}


	public void setPinNumber(int pinNumber) {
		this.pinNumber = pinNumber;
	}


	public double getAccountBalance() {
		return accountBalance;
	}


	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}


	public String getCustomerName() {
		return customerName;
	}


	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}


	public int getCustomerMoblie() {
		return customerMoblie;
	}


	public void setCustomerMoblie(int customerMoblie) {
		this.customerMoblie = customerMoblie;
	}


	public String getCustomerEmail() {
		return customerEmail;
	}


	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}


	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", accountNumber=" + accountNumber + ", pinNumber=" + pinNumber
				+ ", accountBalance=" + accountBalance + ", customerName=" + customerName + ", customerMoblie="
				+ customerMoblie + ", customerEmail=" + customerEmail + "]";
	}
	
	
	
}
