package com;

import java.util.Scanner;

public class PersonMain {
	
	
	
	public static void displayPersonalDetails(Person p) {
		System.out.println("First name: "+p.getFirstName());
		System.out.println("Last name: "+p.getLastName());
		System.out.println("Gender: "+p.getGender());
		System.out.println("PhoneNo: "+p.getPhoneNo());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person newP = new Person();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first name");
		String firstname = sc.nextLine();
		try {
			newP.setFirstName(firstname);
		} catch(BlankNameException e) {
			System.out.println(e);
		}
		displayPersonalDetails(newP);
	}

}
