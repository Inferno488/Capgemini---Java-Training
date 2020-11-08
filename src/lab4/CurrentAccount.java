package lab4;

public class CurrentAccount extends Account {

	private double overdraft = 1000;
	CurrentAccount(double balance, Person accHolder) {
		super(balance, accHolder);
		// TODO Auto-generated constructor stub
	}
	
	public void withdraw(double amount) {
		if (amount <= overdraft) {
			super.setBalance(getBalance() - amount);
			overdraft -= amount;
		}
		else {
			System.out.println("Overdraft limit reached");
		}
	}
}
