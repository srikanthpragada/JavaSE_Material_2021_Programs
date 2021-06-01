package oop2;

public interface Counter {
	void increment();

	void decrement();

	int getValue();

	default int getIncrement() {
		return 1;
	}

	static void printAuthor() {
		System.out.println("Srikanth Pragada");
	}
}
