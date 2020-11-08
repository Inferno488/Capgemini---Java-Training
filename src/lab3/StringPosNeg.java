package lab3;

import java.util.Scanner;

public class StringPosNeg {
	public static void stringPositive(String str)
	{
		
		int i=0;
		boolean flag = false;
		int len = str.length();
		while(i<len - 1)
		{
				if(str.charAt(i)>str.charAt(i+1)){
					flag = true;
					break;
				}
			i++;
		}
		if(!flag)
		{
			System.out.println("Positive");
		}
		else
		{
			System.out.println("Negative");
		}
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string");
		String str = sc.next();
		stringPositive(str);
	}
	
	
}
