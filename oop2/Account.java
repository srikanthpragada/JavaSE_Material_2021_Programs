package oop2;

public class Account {
	String acno;
	double balance;

	public Account(String acno, double balance) {
		this.acno = acno;
		this.balance = balance;
	}

	public void deposit(double amount) throws InvalidAmountException {
		if (amount < 100) {
			throw new InvalidAmountException();
		}
		balance += amount;
	}

	public void withdraw(double amount) throws InvalidAmountException, InsufficientAmountException {
		if (amount < 100) {
			throw new InvalidAmountException();
		}
		if (balance < amount) {
			throw new InsufficientAmountException();
		}
		balance -= amount;
	}
}