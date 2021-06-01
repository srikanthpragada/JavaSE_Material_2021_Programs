package oop2;

public class Test {
	public static void main(String[] args) {
		int n;

		n = Integer.parseInt(args[0]);
		if (99 % n == 0) {
			System.out.printf("%d is a factor of 99", n);
		}
	}
}