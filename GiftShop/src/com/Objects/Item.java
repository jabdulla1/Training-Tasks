package com.Objects;

public class Item {

	double price;
	String name;
	
	
	public Item() {
		super();
	}


	public Item(String name, double price) {
		super();
		this.price = price;
		this.name = name;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
}
