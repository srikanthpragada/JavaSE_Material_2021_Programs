package oop2;

public class UseAccount {
	public static void main(String[] args) {
		Account a = new Account("1002", 10000);
		try {
			a.deposit(1000);
			System.out.println("Deposited 1000");
			a.deposit(50);
		} catch (InvalidAmountException ex) {
			System.out.println(ex.getMessage());
		}
		try {
			a.withdraw(5000);
			System.out.println("Withdrew 5000");
			a.withdraw(8000);
			System.out.println("Withdrew 8000");
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
