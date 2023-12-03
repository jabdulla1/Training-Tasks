package com.interfacesAndImp;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

import com.objects.Customer;

public class BankAppValidateImp implements BankAppValidate {

	private List<Customer> bankDataList;
	
	
	
	public BankAppValidateImp(List<Customer> bankDataList) {
		super();
		this.bankDataList = bankDataList;
	}



	public List<Customer> getBankDataList() {
		return bankDataList;
	}



	public void setBankDataList(List<Customer> bankDataList) {
		this.bankDataList = bankDataList;
	}



	@Override
	public Customer ValidateCustomer(Scanner validateInput) {
		// TODO Auto-generated method stub
		
		long accountNumber =0;
		int pinNumber=0;
		validateInput = new Scanner(System.in);
		String exit;
		Customer customer = null;
		do {
			accountNumber =0;
			pinNumber=0;
			customer= null;
			
			try {
				
				
			System.out.println("---------------------------------");
			System.out.println("Welcome to the BankApp");
			System.out.println("Please Enter your Account Number: ");
			accountNumber = Long.parseLong(validateInput.nextLine());
			System.out.println("Please Enter your Pin Number");
			pinNumber = Integer.parseInt(validateInput.nextLine());
			System.out.println("---------------------------------");
			}catch(Exception e){
				System.out.println("Invalid Input");
				
			}
			
			
			for(int c=0; c < this.bankDataList.size(); c++) {
				if((this.bankDataList.get(c).getAccountNumber() == accountNumber)
						&&(this.bankDataList.get(c).getPinNumber() == pinNumber)
				) {
					
					 System.out.println("Customer Found");
					
					 customer = this.bankDataList.get(c);
					 break;
					 
				}
			}
			
			
			if(customer == null)
			System.out.println("Customer Not Found Enter 'y' To Try Again");

			
		}while((customer == null)&&(validateInput.nextLine()).equals("y"));
		
		return customer;
	}

}
