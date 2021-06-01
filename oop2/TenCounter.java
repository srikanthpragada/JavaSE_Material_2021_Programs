package oop2;

public class TenCounter implements Counter {
	private int value;

	@Override
	public void increment() {
		value += getIncrement();
	}

	@Override
	public void decrement() {
		value -= getIncrement();
	}

// Override default implementation 
	@Override
	public int getIncrement() {
		return 10;
	}

	@Override
	public int getValue() {
		return value;
	}
}