package oop2;

public class Test1 {
	public static void main(String[] args) {
		int n;
		try {
			n = Integer.parseInt(args[0]);
			if (99 % n == 0)
				System.out.printf("%d is a factor of 99", n);
		} catch (NumberFormatException ex) {
			System.out.println("Invalid number!");
		}
	} // end of main
} // end of class
