package com.interfacesAndImp;

import java.io.ByteArrayInputStream;
import java.util.Scanner;
import java.lang.Integer;

import com.objects.BankAppData;
import com.objects.Customer;

public class BankAppCustomerScreenImp implements BankAppCustomerScreen {

		// TODO Auto-generated method stub
	@Override
	public void	ViewCustomerScreen() {
		
		BankAppData bankAppData = new BankAppData();
		
		BankAppValidate bankAppValidate = new BankAppValidateImp(bankAppData.getCustomers());
		BankAppDepositCash bankAppDepositcash = new BankAppDepositCashImp();			
		BankAppDepositCheck bankAppDepositCheck = new BankAppDepositCheckImp();
		BankAppWithdraw bankAppWithdraw = new BankAppWithdrawImp();
		BankAppViewBalance bankAppViewBalance = new BankAppViewBalanceImp();
		
		Customer validCustomer;
		Scanner input = new Scanner(System.in);
		int in=0;
			
			validCustomer = bankAppValidate.ValidateCustomer(input);
			if(validCustomer == null) {
				System.out.println("\nInvalid Customer");
				System.out.println("\nExiting");
				System.exit(0);
			}
			
		double money=0;
			
		do {
			Customer newCustomer=null;
			in=0;
			money=0;
			try {
				input = new Scanner(System.in);
				
			System.out.println("------------------------------------");
			System.out.println("Welcome "+ validCustomer.getCustomerName());
			System.out.println("------------------------------------");
			System.out.println("1. Make A Withdraw");
			System.out.println("2. Make A Cash Deposit");
			System.out.println("3. View Your Balance");
			System.out.println("4. Make A Check Deposit");
			System.out.println("5. Quit");
			System.out.println("------------------------------------");
			
				
				in = Integer.parseInt(input.nextLine());
				money=0;
			switch(in) {
			case 1:
				System.out.println("Enter Amount to Withdraw");
				money = Double.parseDouble(input.nextLine());
				newCustomer = bankAppWithdraw.Withdraw(validCustomer, money);
				
				break;
			case 2:
				System.out.println("Enter Cash Deposit");
				money = Double.parseDouble(input.nextLine());
				newCustomer = bankAppDepositcash.DepositCash(validCustomer, money);								
				break;
			case 3:
				bankAppViewBalance.ViewBalance(validCustomer);							
				break;
			case 4:

				System.out.println("Enter Check Deposit");
				money = Double.parseDouble(input.nextLine());
				newCustomer = bankAppDepositCheck.DepositCheck(validCustomer, money);				
				break;
			case 5:
				break;
			
				default:
					System.out.println("Invalid Input From the Menu");
					input = new Scanner(System.in);
					break;
			}
			}catch(Exception e) {
			
				System.out.println("Invalid Input Exception");
				e.printStackTrace();
				if(input.hasNextLine())
				input.nextLine();
			}

		}while(in != 5);
		System.out.println("Thank You");
	}

}
