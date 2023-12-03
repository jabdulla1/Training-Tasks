package com.main;

import com.interfacesAndImp.BankAppCustomerScreen;
import com.interfacesAndImp.BankAppCustomerScreenImp;
import com.interfacesAndImp.BankAppDepositCash;
import com.interfacesAndImp.BankAppDepositCashImp;
import com.interfacesAndImp.BankAppDepositCheck;
import com.interfacesAndImp.BankAppDepositCheckImp;
import com.interfacesAndImp.BankAppValidate;
import com.interfacesAndImp.BankAppValidateImp;
import com.interfacesAndImp.BankAppViewBalance;
import com.interfacesAndImp.BankAppViewBalanceImp;
import com.interfacesAndImp.BankAppWithdraw;
import com.interfacesAndImp.BankAppWithdrawImp;
import com.objects.BankAppData;
import com.objects.Customer;

public class BankAppMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
		BankAppCustomerScreen bankAppCustomerScreen = new BankAppCustomerScreenImp();
		bankAppCustomerScreen.ViewCustomerScreen();
		
	}

}
