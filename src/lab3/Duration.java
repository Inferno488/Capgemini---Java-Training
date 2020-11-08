package lab3;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Duration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Please Enter the Date (YYYY/MM/DD): ");
		int year = s.nextInt();
		int month = s.nextInt();
		int day = s.nextInt();
		System.out.println("Please Enter the second Date (YYYY/MM/DD): ");
		int year2 = s.nextInt();
		int month2 = s.nextInt();
		int day2 = s.nextInt();
		LocalDate d = LocalDate.of(year, month, day);
		LocalDate n = LocalDate.of(year2,month2,day2);
		Period p = Period.between(d, n);
		System.out.println("Duration from given date: " + p.getYears() + " years, " + p.getMonths() + " months and " + p.getDays() +" days.");
	}

}
