package lab4;

public class Account {
	private long accNo;
	private double balance;
	private Person accHolder;
	
	
	//GENERATE VALUES
	Account(double balance, Person accHolder) {
		this.balance = balance;
		this.accHolder = accHolder;
		String genNum = Double.toString(Math.random()).substring(3,12);
		this.accNo = Long.parseLong(genNum);
	}
	
	//GETTERS SETTERS
	public long getAccNo() {
		return accNo;
	}
	/*public void setAccNo(long accNo) {
		this.accNo = accNo;
	}*/
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Person getAccHolder() {
		return accHolder;
	}
	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}
	
	
	//METHODS
	
	public void deposit(double amount) {
		this.balance += amount;
	}
	
	public void withdraw(double amount) {
		if (amount <= this.balance) {
			this.balance -= amount;
		}
		else System.out.println("Not enough funds");
	}
	
	//TO STRING OVERRIDE
	
	public String toString() {
		return String.format("Person Details "+accHolder + " " + " Bank Details " + this.accNo + " " +this.balance);
	}
}
