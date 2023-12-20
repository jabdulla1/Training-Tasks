package com.snva.module;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Booking implements InBooking{
	private List<Show> theater;

	public Booking() {
		super();
		
		this.theater = new ArrayList<Show>();
		
		this.theater.add(new Show(new HashMap<String, Integer>(),"Show1"));
		this.theater.add(new Show(new HashMap<String, Integer>(),"Show2"));
		this.theater.add(new Show(new HashMap<String, Integer>(),"Show3"));
		this.theater.add(new Show(new HashMap<String, Integer>(),"Show4"));
		this.theater.add(new Show(new HashMap<String, Integer>(),"Show5"));
		this.theater.add(new Show(new HashMap<String, Integer>(),"Show6"));
		
		this.theater.get(0).getSeats().put("Front",new Integer(5));
		this.theater.get(0).getSeats().put("Middle",new Integer(10));
		this.theater.get(0).getSeats().put("Back",new Integer(15));
		
		this.theater.get(1).getSeats().put("Front",new Integer(1));
		this.theater.get(1).getSeats().put("Middle",new Integer(5));
		this.theater.get(1).getSeats().put("Back",new Integer(10));
		
		this.theater.get(2).getSeats().put("Front",new Integer(2));
		this.theater.get(2).getSeats().put("Middle",new Integer(6));
		this.theater.get(2).getSeats().put("Back",new Integer(7));
		
		this.theater.get(3).getSeats().put("Front",new Integer(7));
		this.theater.get(3).getSeats().put("Middle",new Integer(8));
		this.theater.get(3).getSeats().put("Back",new Integer(9));
		
		this.theater.get(4).getSeats().put("Front",new Integer(1));
		this.theater.get(4).getSeats().put("Middle",new Integer(2));
		this.theater.get(4).getSeats().put("Back",new Integer(3));
		
		this.theater.get(5).getSeats().put("Front",new Integer(4));
		this.theater.get(5).getSeats().put("Middle",new Integer(8));
		this.theater.get(5).getSeats().put("Back",new Integer(12));
	}

	public Booking(List<Show> theater) {
		super();
		this.theater = theater;
	}

	public List<Show> getTheater() {
		return theater;
	}

	public void setTheater(List<Show> theater) {
		this.theater = theater;
	}
	
	public boolean BookSeat(String showName, String location) {
		boolean seatsAvilable = false;
		
		for(int x =0; x<this.theater.size(); x++) {
			if(showName.equals(this.theater.get(x).getNameOfshow())) {
				if(this.theater.get(x).getSeats().get(location).intValue() > 0) {
				
					Integer updateInteger = new Integer(this.theater.get(x).getSeats().get(location).intValue()- 1);
					this.theater.get(x).getSeats().put(location, updateInteger);
					
					seatsAvilable = true;
					break;
				}
			}
		}				
		return seatsAvilable;
	}
}
