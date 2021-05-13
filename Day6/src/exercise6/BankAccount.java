package exercise6;

public class BankAccount {

	public static void main(String[] args) {
		
		Account hagosAccount = new Account("Hagos", "Gebru", 5000);
		
		System.out.println(hagosAccount);
		
		hagosAccount.debit(700);
		hagosAccount.debit(2000);
		
		
		Account jamesAccount = new Account("James", "Bond", 3000);
		System.out.println(jamesAccount);
		jamesAccount.credit(1000);
		jamesAccount.credit(2000);
		jamesAccount.credit(2000);
		
	}

}
