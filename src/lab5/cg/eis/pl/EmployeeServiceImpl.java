package com.cg.eis.pl;

import java.util.Scanner;

import com.cg.eis.bean.Employee;
import com.cg.eis.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {

	@Override
	public Employee getEmpDetails() {
		String designation;
		String insuranceScheme = null;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter employee id");
		int id = in.nextInt();
		System.out.println("Enter employee salary");
		double salary = in.nextDouble();
		System.out.println("Enter employee name");
		String name = in.next();
	
		if(salary<5000){
			designation = "Clerk";
		}
		else if(salary>5000&&salary<20000){
			designation = "System Associate";
		}
		else if(salary>=20000&&salary<40000){
			designation = "Programmer";
		}
		else{
			designation = "Manager";
		}
		
		Employee emp = new Employee(id,name,designation,insuranceScheme,salary);
		return emp;
			
		}

	@Override
	public String insuranceScheme(String designation,double salary) {
		String scheme;
		if(designation == "Clerk")
			scheme = "No Scheme";
		else if(designation == "System Associate")
			scheme = "Scheme C";
		else if(designation == "Programmer")
			scheme = "Scheme B";
		else
			scheme = "Scheme A";
		return scheme;
	}

	@Override
	public void EmpDetails(Employee emp) {
		System.out.println("Employee id"+emp.id);
		System.out.println("Employee name"+emp.name);
		System.out.println("Employee designation"+emp.designation);
		System.out.println("Employee salary"+emp.salary);
		System.out.println("Employee insurancescheme"+emp.insuranceScheme);
		
	}

	

}
