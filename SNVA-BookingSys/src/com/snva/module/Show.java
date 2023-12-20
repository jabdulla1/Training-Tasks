package com.snva.module;

import java.util.Map;

public class Show {
	private Map<String, Integer> seats;
	private String nameOfshow;
	
	
	public Show() {
		super();
	}


	public Show( Map<String, Integer> seats, String nameOfshow) {
		super();
		this.seats = seats;
		this.nameOfshow = nameOfshow;
	}

	

	public Map<String, Integer> getSeats() {
		return seats;
	}


	public void setSeats(Map<String, Integer> seats) {
		this.seats = seats;
	}


	public String getNameOfshow() {
		return nameOfshow;
	}


	public void setNameOfshow(String nameOfshow) {
		this.nameOfshow = nameOfshow;
	}
	
	
	
}
