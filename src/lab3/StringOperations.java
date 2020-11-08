package lab3;
import java.util.Scanner;

public class StringOperations {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter String: ");
		String a = s.next();
		System.out.println("Enter Option: ");
		String b = s.next();
		switch (b) {

		case "1":
			System.out.println(a + a);
			break;
		case "2":
			for (int i = 0; i < a.length() + 1; i++) {
				if (i % 2 == 0) {
					a = a.substring(0, i - 1) + "#"
							+ a.substring(i, a.length());
				}
			}
			System.out.println(a);
			break;
		case "3":
			String c = "";
			for (int j = 0; j < a.length(); j++) {
				if (!c.contains(String.valueOf(a.charAt(j)))){
					c += String.valueOf(a.charAt(j));
				}
			}
			System.out.println(c);
			break;
		case "4":
			String d = "";
			for (int i = 0; i < a.length(); i++) {
				if (i % 2 != 0) {
					d += String.valueOf(a.charAt(i)).toUpperCase();
					
				}
				else {
					d += String.valueOf(a.charAt(i));
				}
			}
			System.out.println(d);
			break;
		default:
			System.out.println("Enter 1, 2, 3 or 4.");
		}

	}

}