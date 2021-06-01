package gettingstarted;

// program to check whether a number is prime
public class Prime {
	public static void main(String[] args) {
		// check whether number is passed 
		if (args.length == 0) {
			System.out.println("Number is missing!");
			return;
		}
		
		// convert args[0] to int
		int n = Integer.parseInt(args[0]);
		boolean prime = true;

		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				prime = false;
				break;
			}
		} // end of for

		if (prime)
			System.out.println("Prime Number");
		else
			System.out.println("Not a prime number");
	} // end of main
}