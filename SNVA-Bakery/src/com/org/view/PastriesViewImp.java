package com.org.view;

import java.util.Scanner;

import com.org.calculate.CalPastries;
import com.org.calculate.CalPastriesImp;
import com.org.calculate.CalTotal;
import com.org.calculate.CalTotalImp;
import com.org.object.Pastries;

public class PastriesViewImp implements PastriesView{

	
	public void RunView() {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Pastries Blackpastries = new Pastries("Black Current", 50, 1, 0);
		Pastries Whitepastries = new Pastries("White Forest", 30, 1, 0);
		Pastries Chocolatepastries = new Pastries("Chocolate", 40, 1, 0);
		Pastries Redpastries = new Pastries("Red Velvet", 45, 1, 0);
		
		CalPastries calPastries = new CalPastriesImp();
		CalTotal calTotal = new CalTotalImp();
		double total=0;
		double payable=0;
		
		System.out.println("\t\t\tWelcome to SNVA Bakery\n");
		
		System.out.println("Enter No. of Black Pastries");
		Blackpastries.setQuanity(Integer.parseInt(input.nextLine()));
		System.out.println("Enter No. of White Forest Pastries");
		Whitepastries.setQuanity(Integer.parseInt(input.nextLine()));
		System.out.println("Enter No. of Chocolate Pastries");
		Chocolatepastries.setQuanity(Integer.parseInt(input.nextLine()));
		System.out.println("Enter No. of Red Velvet Pastries");
		Redpastries.setQuanity(Integer.parseInt(input.nextLine()));
		
		if(Blackpastries.getQuanity() == 0) {
			Blackpastries.setQuanity(1);
			Blackpastries.setPayable(50);
		}
		else {
			Blackpastries.setPayable(calPastries.CalQtyPastries(Blackpastries));
		}
		
		
		if(Whitepastries.getQuanity() == 0) {
			Whitepastries.setQuanity(1);
			Whitepastries.setPayable(30);
		}
		else {
			Whitepastries.setPayable(calPastries.CalQtyPastries(Whitepastries));
		}
		
		
		if(Chocolatepastries.getQuanity() == 0) {
			Chocolatepastries.setQuanity(1);
			Chocolatepastries.setPayable(40);
		}
		else {
			Chocolatepastries.setPayable(calPastries.CalQtyPastries(Chocolatepastries));
		}
		
		
		if(Redpastries.getQuanity() == 0) {
			Redpastries.setQuanity(1);
			Redpastries.setPayable(45);
		}
		else {
			Redpastries.setPayable(calPastries.CalQtyPastries(Redpastries));
		}
		
		System.out.println("------------------------------------------------------------------");
		System.out.println("Menu Item "+"\t\tPrice"+"\t\tQty "+ "\t\tPayable");
		System.out.println("------------------------------------------------------------------");
		System.out.println("Blackcurrent \t\t$"+ Blackpastries.getPrice()+" \t\t"+Blackpastries.getQuanity()+" \t\t$"+Blackpastries.getPayable());
		System.out.println("Whiteforest \t\t$"+ Whitepastries.getPrice()+" \t\t"+Whitepastries.getQuanity()+ " \t\t$"+Whitepastries.getPayable());
		System.out.println("Chocholate \t\t$"+ Chocolatepastries.getPrice()+" \t\t"+Chocolatepastries.getQuanity()+" \t\t$"+Chocolatepastries.getPayable());
		System.out.println("Red Velvet \t\t$"+ Redpastries.getPrice()+" \t\t"+Redpastries.getQuanity()+" \t\t$"+Redpastries.getPayable());
		
		System.out.println("------------------------------------------------------------------");
		System.out.println("Totoal: \t\t\t\t\t\t$" + calTotal.CalculateTotal(Blackpastries, Whitepastries, Chocolatepastries, Redpastries));
		System.out.println("------------------------------------------------------------------");
		
		System.out.println("Thank You");
		input.close();
	}

	
}
