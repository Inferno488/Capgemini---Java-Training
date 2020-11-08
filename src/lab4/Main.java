package lab4;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person("Smith",22);
		Person p2 = new Person("Kathy",27);
		
		Account a1 = new Account(2000, p1);
		Account a2 = new Account(3000, p2);
		
		System.out.println(a1);
		a1.deposit(2000);
		System.out.println(a1);
		System.out.println();
		System.out.println(a2);
		a2.withdraw(2000);
		System.out.println(a2);
		
		SavingAccount s1 = new SavingAccount(3000, p1);
		CurrentAccount c1 = new CurrentAccount(4000, p2);
		System.out.println("Savings Account");
		System.out.println(s1);
		s1.withdraw(2700);
		s1.withdraw(200);
		System.out.println(s1);
		
		System.out.println("Current Account");
		System.out.println(c1);
		c1.withdraw(900);
		c1.withdraw(200);
		System.out.println(c1);
		
	}

}
