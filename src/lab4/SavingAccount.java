package lab4;

public class SavingAccount extends Account{

	final double minBalance;
	SavingAccount(double balance, Person accHolder) {
		super(balance, accHolder);
		// TODO Auto-generated constructor stub
		minBalance = 500;
	}
	
	public void withdraw(double amount) {
		if (super.getBalance() <= minBalance) {
			System.out.println("You cannot withdraw");
		}
		else {
			super.setBalance(super.getBalance() - amount);
		}
	}

}
