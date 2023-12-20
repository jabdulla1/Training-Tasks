package com.org.object;

public class Pastries {
	private String name;
	private double price;
	private int quanity;
	private double payable;
	
	
	public Pastries() {
		super();
	}


	


	public Pastries(String name, double price, int quanity, double payable) {
		super();
		this.name = name;
		this.price = price;
		this.quanity = quanity;
		this.payable = payable;
	}





	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public int getQuanity() {
		return quanity;
	}


	public void setQuanity(int quanity) {
		this.quanity = quanity;
	}


	public double getPayable() {
		return payable;
	}


	public void setPayable(double payable) {
		this.payable = payable;
	}
	
	
	
}
