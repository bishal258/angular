package com.luv2code.springdemo.entity;

public class Address {
	
	
	private String city;
	private String zip;
	private String state;
	
	public Address(String city, String zip, String state) {
		super();
		this.city = city;
		this.zip = zip;
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
		
	
	
}
