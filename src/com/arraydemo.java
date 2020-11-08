package com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class arraydemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList java = new ArrayList();
		java.add("sachin");
		java.add("ravi");
		java.add("kumar");
		java.add("harshit");
		
		ArrayList sql = new ArrayList();
		sql.add("virat");
		sql.add("murali");
		sql.add("sachin");
		sql.add("kumar");
		
		
		ArrayList students = new ArrayList(java);
		students.addAll(sql);
		
		for(Object ele:java) {
			if(!students.contains(ele)) students.add(ele);
		}
		for(Object i:sql) {
			if(!students.contains(i)) {
				students.add(i);
			}
		}
		
		
		System.out.println(students);
		
		LinkedList l = new LinkedList();
		l.add(5);
		l.add(4);
		l.add(3);
		System.out.println(l);
		
		Stack s = new Stack();
		s.push(1);
		s.push(2);
		s.push(3);
		System.out.println(s);
		
	}
}
