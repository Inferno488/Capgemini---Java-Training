package com;

import java.util.ArrayList;
import java.util.Comparator;

public class comparableDemo { 
	public static void main(String args[]) {
		ArrayList<Student> o = new ArrayList<Student>();
		o.add(new Student(0,"sachin",18));
		o.add(new Student(1,"ravi",16));
		o.add(new Student(2,"kkumar",19));
		
		for(Student s: o) {
			System.out.println(s);
		}
	}

}

class Student {
	int id;
	String name;
	int age;
	
	public Student(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		
	}
}

class AgeComparator implements Comparator<Student> {
	public int compare(Student o1, Student o2) {
		if(o1.age  > o2.age) {
			return 0;
		}
		else if (o2.age > o1.age) {
			return 1;
		}
		else return -1;
	}
 }