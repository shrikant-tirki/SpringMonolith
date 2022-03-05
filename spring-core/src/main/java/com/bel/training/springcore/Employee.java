package com.bel.training.springcore;

public class Employee {

	private int id;
	private String name, city;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", city=" + city + "]";
	}
	
	void display()
	{
		System.out.println("************ Employee Details ********** ");
		System.out.println(id+" "+name+" "+city);
		System.out.println(this.toString());
	}
	
}
