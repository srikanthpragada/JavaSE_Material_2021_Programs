package oop1;

public class StaticTest {
	private int iv;
	private static int sv;

	public static void main(String[] args) {
		// iv = 10; // not valid
		StaticTest obj = new StaticTest();
		obj.iv = 10; // valid as we use object to access iv
	}
}