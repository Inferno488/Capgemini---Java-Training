package lab3;
import java.time.LocalDate;
import java.util.*;
public class Expiration {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("Please Enter Purchase Date (YYYY/MM/DD): ");
		int y1 = s.nextInt();
		int m1 = s.nextInt();
		int d1 = s.nextInt();
		LocalDate d = LocalDate.of(y1, m1, d1);
		System.out.println("Please Enter Warranty Period (no. of year(s) and month(s)): ");
		int y2 = s.nextInt();
		int m2 = s.nextInt();
		System.out.println("Expiry Date: " + d.plusYears(y2).plusMonths(m2));
	}
}
