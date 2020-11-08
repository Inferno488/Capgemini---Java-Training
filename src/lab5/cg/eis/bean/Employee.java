package com.cg.eis.bean;
public class Employee {
	public int id;
	public String name,designation,insuranceScheme;
	public double salary;
	public Employee(int id, String name, String designation,String insuranceScheme,double salary) {
		super();
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.insuranceScheme = insuranceScheme;
		this.salary = salary;
	}
	public Employee(){
		
	}
	
}
