package com;

public class Palindrome {
	public static void Palin(String... str) 
    { 
		for(String s: str) {
			int start = 0, end = s.length() - 1;
			boolean palin = true;
			while (start < end) {  
				if (s.charAt(start)!=s.charAt(end)) {
					palin = false;
				}
				start++;end--; 
			} 
			if(palin == true) {
				System.out.println(s+ " is a palindrome");
			}
			else {
				System.out.println(s+ " is not a palindrome");
			}
		}
	} 
	
	public static void main(String args[]) {
		Palin("hello","bob","boy","lool");
	}
}
