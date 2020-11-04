package com;

import java.util.Scanner;
public enum Gender {M, F };
public class Person {
	private String firstname;
	private String lastname;
	private int phoneno;
	private Gender gender;
	Scanner sc = new Scanner(System.in);
	
	Person() {
		System.out.println("Enter firstname:");
		this.firstname = sc.next();
		System.out.println("Enter lastname:");
		this.lastname = sc.next();
		System.out.println("Enter firstname:");
		this.gender = sc.next().charAt(0);
		System.out.println("Enter phone.no");
		this.phoneno = sc.nextInt();
	}
	
	Person(String firstname, String lastname, Gender gender, int phoneno) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.gender = gender;
		this.phoneno = phoneno;
	}
	
	public void setFirstName(String firstname) {
		this.firstname = firstname;
	}
	public void setLastName(String lastname) {
		this.lastname = lastname;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public void setPhoneNo(int phoneno) {
		this.phoneno = phoneno;
	}
	
	
	public String getFirstName() {
		return this.firstname;
	}
	public String getLastName() {
		return this.lastname;
	}
	public Gender getGender() {
		return this.gender;
	}
	public int getPhoneNo() {
		return this.phoneno;
	}
}

