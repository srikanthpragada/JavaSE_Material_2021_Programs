package oop2;
public class OneCounter implements Counter {
	private int value;

	@Override
	public void increment() {
		value += getIncrement();
	}

	@Override
	public void decrement() {
		value -= getIncrement();
	}

	@Override
	public int getValue() {
		return value;
	}
}