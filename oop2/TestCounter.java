package oop2;

public class TestCounter {
	public static void main(String[] args) {
		Counter.printAuthor();

		Counter c = new OneCounter();
		c.increment();
		System.out.println(c.getIncrement());
		System.out.println(c.getValue());

		Counter c2 = new TenCounter();
		c2.increment();
		System.out.println(c2.getValue());
	}
}