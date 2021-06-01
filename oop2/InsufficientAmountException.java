package oop2;

public class InsufficientAmountException extends Exception {
	public InsufficientAmountException() {
		super("Insufficient Balance!");
	}

	public InsufficientAmountException(String msg) {
		super(msg);
	}
}