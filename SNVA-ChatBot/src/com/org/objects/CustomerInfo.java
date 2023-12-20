package com.org.objects;

public class CustomerInfo {
	
	private String name;
	private String addressLine;
	private String city;
	private String state;
	private String zipCode;
	private String model;
	private String MSRP;
	private String taxes;
	private String cash;
	private String downPayment;
	
	
	public CustomerInfo() {
		super();
	}


	public CustomerInfo(String name, String addressLine, String city, String state, String zipCode, String model,
			String mSRP, String taxes, String cash, String downPayment) {
		super();
		this.name = name;
		this.addressLine = addressLine;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.model = model;
		MSRP = mSRP;
		this.taxes = taxes;
		this.cash = cash;
		this.downPayment = downPayment;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddressLine() {
		return addressLine;
	}


	public void setAddressLine(String addressLine) {
		this.addressLine = addressLine;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public String getZipCode() {
		return zipCode;
	}


	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public String getMSRP() {
		return MSRP;
	}


	public void setMSRP(String mSRP) {
		MSRP = mSRP;
	}


	public String getTaxes() {
		return taxes;
	}


	public void setTaxes(String taxes) {
		this.taxes = taxes;
	}


	public String getCash() {
		return cash;
	}


	public void setCash(String cash) {
		this.cash = cash;
	}


	public String getDownPayment() {
		return downPayment;
	}


	public void setDownPayment(String downPayment) {
		this.downPayment = downPayment;
	}
	
	
		
	
}
