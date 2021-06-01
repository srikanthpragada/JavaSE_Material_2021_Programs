package oop2;

public class InvalidAmountException extends Exception {
	public InvalidAmountException() {
		super("Invalid Transaction Amount!");
	}

	public InvalidAmountException(String msg) {
		super(msg);
	}
}