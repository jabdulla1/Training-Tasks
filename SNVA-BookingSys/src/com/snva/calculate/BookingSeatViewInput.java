package com.snva.calculate;

import java.util.Scanner;

import com.snva.module.Booking;

public class BookingSeatViewInput {

	private Booking theater;
	
	
	public BookingSeatViewInput() {
		super();
		
		theater = new Booking();
	}


	public void ViewInput() {
		
		Scanner scanner = new Scanner(System.in);
		String input;		
		
		do {
		System.out.println("----------Welcom to the SNVA's Theater Booking System----------");
		System.out.println("Please Select a Show");
		System.out.println("(1) Show1");
		System.out.println("(2) Show2");
		System.out.println("(3) Show3");
		System.out.println("(4) Show4");
		System.out.println("(5) Show5");
		System.out.println("(6) Show6");
		
		input= scanner.nextLine();		
		
		switch(input.trim()){
			case "1":
				
				System.out.println("Enter Seating Arrangements For Show1");
				System.out.println("(1) Front   | Available Seats: "+ this.theater.getTheater().get(0).getSeats().get("Front").intValue());
				System.out.println("(2) Middle  | Available Seats: "+ this.theater.getTheater().get(0).getSeats().get("Middle").intValue());
				System.out.println("(3) Back    | Available Seats: "+ this.theater.getTheater().get(0).getSeats().get("Back").intValue());
				input= scanner.nextLine();		
				
				if(input.trim().equals("1")) {
					if(theater.BookSeat("Show1","Front")) {
						System.out.println("Your Seat for Show1 Front Has been Reserved");
					}
					else {
						System.out.println("Your Seat for Show1 Front is Full");
					}
				}else if(input.trim().equals("2")) {
					if(theater.BookSeat("Show1","Middle")) {
						System.out.println("Your Seat for Show1 Middle Has been Reserved");
					}
					else {
						System.out.println("Your Seat for Show1 Middle is Full");
					}
				}else if(input.trim().equals("3")){
					if(theater.BookSeat("Show1","Back")) {
						System.out.println("Your Seat for Show1 Back Has been Reserved");
					}
					else {
						System.out.println("Your Seat for Show1 Back is Full");
					}
				}else {
					System.out.println("Invalid Seating");
				}
				
				break;
				
			case "2":				
				
				System.out.println("Enter Seating Arrangement For Show2");
				System.out.println("(1) Front   | Available Seats: "+ this.theater.getTheater().get(1).getSeats().get("Front").intValue());
				System.out.println("(2) Middle  | Available Seats: "+ this.theater.getTheater().get(1).getSeats().get("Middle").intValue());
				System.out.println("(3) Back    | Available Seats: "+ this.theater.getTheater().get(1).getSeats().get("Back").intValue());
				input= scanner.nextLine();		
				
				if(input.trim().equals("1")) {
					if(theater.BookSeat("Show2","Front")) {
						System.out.println("Your Seat for Show2 Front Has been Reserved");
					}
					else {
						System.out.println("Your Seat for Show2 Front is Full");
					}
				}else if(input.trim().equals("2")) {
					if(theater.BookSeat("Show2","Middle")) {
						System.out.println("Your Seat for Show2 Middle Has been Reserved");
					}
					else {
						System.out.println("Your Seat for Show2 Middle is Full");
					}
				}else if(input.trim().equals("3")) {
					if(theater.BookSeat("Show2","Back")) {
						System.out.println("Your Seat for Show2 Back Has been Reserved");
					}
					else {
						System.out.println("Your Seat for Show2 Back is Full");
					}
				}else {
					System.out.println("Invalid Seating");
				}
			
				
				break;
			
			case "3":				
				
				System.out.println("Enter Seating Arrangement For Show3");
				System.out.println("(1) Front   | Available Seats: "+ this.theater.getTheater().get(2).getSeats().get("Front").intValue());
				System.out.println("(2) Middle  | Available Seats: "+ this.theater.getTheater().get(2).getSeats().get("Middle").intValue());
				System.out.println("(3) Back    | Available Seats: "+ this.theater.getTheater().get(2).getSeats().get("Back").intValue());
				input= scanner.nextLine();		
				
				if(input.trim().equals("1")) {
					if(theater.BookSeat("Show3","Front")) {
						System.out.println("Your Seat for Show3 Front Has been Reserved");
					}
					else {
						System.out.println("Your Seat for Show3 Front is Full");
					}
				}else if(input.trim().equals("2")) {
					if(theater.BookSeat("Show3","Middle")) {
						System.out.println("Your Seat for Show3 Middle Has been Reserved");
					}
					else {
						System.out.println("Your Seat for Show3 Middle is Full");
					}
				}else if(input.trim().equals("3")){
					if(theater.BookSeat("Show3","Back")) {
						System.out.println("Your Seat for Show3 Back Has been Reserved");
					}
					else {
						System.out.println("Your Seat for Show3 Back is Full");
					}
				}else {
					System.out.println("Invalid Seating");
				}
							
				break;
			
			case "4":				
				
				System.out.println("Enter Seating Arrangement For Show4");
				System.out.println("(1) Front   | Available Seats: "+ this.theater.getTheater().get(3).getSeats().get("Front").intValue());
				System.out.println("(2) Middle  | Available Seats: "+ this.theater.getTheater().get(3).getSeats().get("Middle").intValue());
				System.out.println("(3) Back    | Available Seats: "+ this.theater.getTheater().get(3).getSeats().get("Back").intValue());
				input= scanner.nextLine();		
				
				if(input.trim().equals("1")) {
					if(theater.BookSeat("Show4","Front")) {
						System.out.println("Your Seat for Show4 Front Has been Reserved");
					}
					else {
						System.out.println("Your Seat for Show4 Front is Full");
					}
				}else if(input.trim().equals("2")) {
					if(theater.BookSeat("Show4","Middle")) {
						System.out.println("Your Seat for Show4 Middle Has been Reserved");
					}
					else {
						System.out.println("Your Seat for Show4 Middle is Full");
					}
				}else if(input.trim().equals("3")){
					if(theater.BookSeat("Show4","Back")) {
						System.out.println("Your Seat for Show4 Back Has been Reserved");
					}
					else {
						System.out.println("Your Seat for Show4 Back is Full");
					}
				}else {
					System.out.println("Invalid Seating");
				}			
				
				break;
				
			case "5":				
				
				System.out.println("Enter Seating Arrangement For Show5");
				System.out.println("(1) Front   | Available Seats: "+ this.theater.getTheater().get(4).getSeats().get("Front").intValue());
				System.out.println("(2) Middle  | Available Seats: "+ this.theater.getTheater().get(4).getSeats().get("Middle").intValue());
				System.out.println("(3) Back    | Available Seats: "+ this.theater.getTheater().get(4).getSeats().get("Back").intValue());
				input= scanner.nextLine();		
				
				if(input.trim().equals("1")) {
					if(theater.BookSeat("Show5","Front")) {
						System.out.println("Your Seat for Show5 Front Has been Reserved");
					}
					else {
						System.out.println("Your Seat for Show5 Front is Full");
					}
				}else if(input.trim().equals("2")) {
					if(theater.BookSeat("Show5","Middle")) {
						System.out.println("Your Seat for Show5 Middle Has been Reserved");
					}
					else {
						System.out.println("Your Seat for Show5 Middle is Full");
					}
				}else if(input.trim().equals("3")){
					if(theater.BookSeat("Show5","Back")) {
						System.out.println("Your Seat for Show5 Back Has been Reserved");
					}
					else {
						System.out.println("Your Seat for Show5 Back is Full");
					}
				}else {
					System.out.println("Invalid Seating");
				}			
				
				break;
				
			case "6":				
				
				System.out.println("Enter Seating Arrangement For Show6");
				System.out.println("(1) Front   | Available Seats: "+ this.theater.getTheater().get(5).getSeats().get("Front").intValue());
				System.out.println("(2) Middle  | Available Seats: "+ this.theater.getTheater().get(5).getSeats().get("Middle").intValue());
				System.out.println("(3) Back    | Available Seats: "+ this.theater.getTheater().get(5).getSeats().get("Back").intValue());
				input= scanner.nextLine();		
				
				if(input.trim().equals("1")) {
					if(theater.BookSeat("Show6","Front")) {
						System.out.println("Your Seat for Show6 Front Has been Reserved");
					}
					else {
						System.out.println("Your Seat for Show6 Front is Full");
					}
				}else if(input.trim().equals("2")) {
					if(theater.BookSeat("Show6","Middle")) {
						System.out.println("Your Seat for Show6 Middle Has been Reserved");
					}
					else {
						System.out.println("Your Seat for Show6 Middle is Full");
					}
				}else if(input.trim().equals("3")){
					if(theater.BookSeat("Show6","Back")) {
						System.out.println("Your Seat for Show6 Back Has been Reserved");
					}
					else {
						System.out.println("Your Seat for Show6 Back is Full");
					}
				}else {
					System.out.println("Invalid Seating");
				}
							
				break;
			default:
				System.out.println("Invalid Input");
		}
		
		System.out.println("\nEnter 'y' to choose another Show or Seat");
		
	}while(scanner.nextLine().trim().toLowerCase().equals("y"));
		
		System.out.println("Thank You For Using SNVA Theater Booking System");
		scanner.close();
		
	}
}
