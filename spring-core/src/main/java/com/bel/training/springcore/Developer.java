package com.bel.training.springcore;


import java.util.List;

//Setter Injection with Collections
public class Developer {

	private int empId;
	private String name;
	private List<String> technologies;
	
	
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getTechnologies() {
		return technologies;
	}
	public void setTechnologies(List<String> technologies) {
		this.technologies = technologies;
	}
	
	
	@Override
	public String toString() {
		return "Developer [empId=" + empId + ", name=" + name + ", technologies=" + technologies + "]";
	}
	
	void display()
	{
		System.out.println("********* Developer Details ***********");
		System.out.println(this.toString());
		System.out.println("Technologies: ");
		for (String technology : technologies) {
			System.out.println(technology);
		}
	}
	
	
}
