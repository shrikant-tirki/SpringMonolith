package com.bel.training.springcore;

// Constructor Injection with Dependency Object
// Has a relationship - Loosely coupled class
public class Candidate {

	private int id;
	private String name;
	private Address address; //Aggregation
	
	public Candidate(){
		System.out.println("********* Candidate Details - Reference Other Beans *******");
	}

	public Candidate(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	void display()
	{
		System.out.println("***** The Candidate Details *********");
		System.out.println(this.id+" "+this.name+" "+this.address);
	}
}
