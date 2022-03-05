package com.bel.training.springcore;

public class Student {

	private String name;

	public String getName() {
		return name;
	}

	public void display(){
		System.out.println("Hello World from Spring by: "+name);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
}
