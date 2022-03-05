package com.bel.training.springcore;

public class Address {

	private String city, state, country;
	
	private Long pincode;

	public Address(String city, String state, String country, Long pincode) {
		super();
		this.city = city;
		this.state = state;
		this.country = country;
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Candidate [city=" + city + ", state=" + state + ", country=" + country + ", pincode=" + pincode + "]";
	}
	
	public void display()
	{
		System.out.println("Details of Address");
	}
}
