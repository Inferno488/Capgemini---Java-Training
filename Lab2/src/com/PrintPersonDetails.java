package com;

import java.util.Scanner;

public class PrintPersonDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String firstname,lastname;
		char gender;
		int age;
		double weight;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter firstname");
		firstname = sc.next();
		System.out.println("Enter lastname");
		lastname = sc.next();
		System.out.println("Enter gender");
		gender = sc.next().charAt(0);
		System.out.println("Enter age");
		age = sc.nextInt();
		System.out.println("Enter weight");
		weight = sc.nextDouble();
		
		System.out.println("Person Details:");
		System.out.println("First Name: "+firstname);
		System.out.println("Last Name: "+lastname);
		System.out.println("Gender: "+gender);
		System.out.println("Age: "+age);
		System.out.println("Weight "+weight);
	}

}
