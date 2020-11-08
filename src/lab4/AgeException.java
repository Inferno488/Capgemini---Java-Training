package lab4;

@SuppressWarnings("serial")
public class AgeException extends Exception {
	AgeException(int age) {
		if( age < 15) System.out.println("Salary is below $3000.");
	}
}
