package com.org.objects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChatBot {
	private List<String> questions;
	//private List<String> responds; 
	private CustomerInfo customerInfo;
	
	
	
	public ChatBot() {
		super();
		
		questions = new ArrayList<>();
		//responds = new ArrayList<>();
		customerInfo = new CustomerInfo();
		System.out.println("Welcome to the SNVA Chatbot");
		System.out.println("We need some information from you so we can get your car.");
		questions.add("\nWhat is your name: ");
		questions.add("\nWhat is your address: ");
		questions.add("\nWhat is your city: ");
		questions.add("\nWhat is your state:");
		questions.add("\nWhat is your zipcode: ");
		questions.add("\nWhat is your model x3, x2, x1: ");
		questions.add("\nYour MSRP is: ");
		questions.add("\nWhat is your taxes:");
		questions.add("\nWhat is your payment cash or debt: ");
		questions.add("\nWhat is your downPayment: ");
		
		
	}

	private String getMSRP(String model) {
		
		if(model.toLowerCase().equals("x1")) {
			return "5000";
		}
		else if(model.toLowerCase().equals("x2")) {
			return "6000";
		}
		else if(model.toLowerCase().equals("x3")) {
			return "7000";
		}
		return "0";
	}
	
	public void Chat() {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println(this.questions.get(0));
		customerInfo.setName(input.nextLine());
		System.out.println("Hello "+ customerInfo.getName() +" Are you feeling good today?");
		
		if(input.nextLine().toLowerCase().equals("yes")) {System.out.println("Thats Good");}
		else {System.out.println("Sorry to hear that");}
		
		System.out.println(this.questions.get(1));
		customerInfo.setAddressLine(input.nextLine());
		
		System.out.println(this.questions.get(2));
		customerInfo.setCity(input.nextLine());
		
		System.out.println(this.questions.get(3));
		customerInfo.setState(input.nextLine());
		
		System.out.println(this.questions.get(4));
		customerInfo.setZipCode(input.nextLine());
		
		System.out.println("Would you like some pizza delivered to you? ");
		if(input.nextLine().toLowerCase().equals("yes")) {System.out.println("Thats Good");}
		else {System.out.println("Sorry to hear that");}
		
		System.out.println(this.questions.get(5));
		customerInfo.setModel(input.nextLine());
		
		System.out.println(customerInfo.getName()+ " " + " you must really like cars? yes");
		if(input.nextLine().toLowerCase().equals("yes")) {System.out.println("Thats Good");}
		else {System.out.println("Sorry to hear that");}
		
		System.out.println(this.questions.get(6));
		customerInfo.setMSRP(getMSRP(customerInfo.getModel()));
		System.out.println(customerInfo.getMSRP());
		
		System.out.println(this.questions.get(7));
		customerInfo.setTaxes(input.nextLine());
		
		System.out.println(this.questions.get(8));
		if(input.nextLine().equals("cash")) {
			System.out.println("Enter you cash payment: ");
			customerInfo.setCash(input.nextLine());
		}else {
			System.out.println("Enter your debt card: ");
			customerInfo.setCash("Debt: and debt card number is: "+ input.nextLine());
		}
				
		System.out.println(this.questions.get(9));
		customerInfo.setDownPayment(input.nextLine());
		
		System.out.println("Money Money Money we all need it "+ customerInfo.getName()+ " Would you like to make a donation? ");
		if(input.nextLine().toLowerCase().equals("yes")) {System.out.println("Thats Good");}
		else {System.out.println("Sorry to hear that");}
		
		
		System.out.println("Good Bye "+ customerInfo.getName());
		System.out.println("Thank you");
		
		
		System.out.println("\n\nThe Customer Details");
		System.out.println("\nName: "+ customerInfo.getName());
		System.out.println("Address: "+ customerInfo.getAddressLine());
		System.out.println("City: "+ customerInfo.getCity());
		System.out.println("State: "+ customerInfo.getState());
		System.out.println("ZipCode: "+ customerInfo.getZipCode());
		System.out.println("Modle: "+ customerInfo.getModel());
		System.out.println("MSRP: "+ customerInfo.getMSRP());
		System.out.println("Taxes: "+ customerInfo.getTaxes());
		System.out.println("Payment: "+ customerInfo.getCash());
		System.out.println("DownPayment: "+ customerInfo.getDownPayment());
		
		input.close();
	}
	
	
	
}
