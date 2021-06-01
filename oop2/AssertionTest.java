package oop2;

public class AssertionTest {

	private void print(int count) {
		assert count > 0 : "Invalid count for print()";
	}

	public static void main(String[] args) {
		AssertionTest t = new AssertionTest();
		t.print(1);
		t.print(0);
	}
}