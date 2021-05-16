package exercise6;

public class Account {

	private String firstName;
	private String lastName;
	private long accountNumber;
	private double balance;
	private double credit;
	
	public static long accountIncrement = 1000;
	
	public Account(String firstName, String lastName, double balance) {
		this.firstName = firstName;
		this.lastName = lastName;
		accountIncrement = accountIncrement + 1;
		this.accountNumber = accountIncrement;
		this.balance = balance;
		}
		
	public String getFirstName() {
		return firstName;
		
	}
	public String getLastName() {
		return lastName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [firstName=" + firstName + ", lastName=" + lastName + ", accountNumber=" + accountNumber
				+ ", balance=" + balance + "]";
	}
	
	public void debit(double debitAmount) {
	
		if (balance < debitAmount) {
			System.out.println("Insufficiant fund");
		}else
			balance = balance - debitAmount;
			System.out.println("Debited amount: " + debitAmount + " " + "Remaining balance: " + balance);
		
}

	public double getCredit() {
		return credit;
	}

	public void setCredit(double credit) {
		this.credit = credit;
	}

	public void credit(double creditAmount) {
		balance = balance + creditAmount;
	    System.out.println("Credit amount: " + creditAmount + " " + "New balance: " + balance);
	}
}	




