package library1;

//import Arrays class from java.util package 
import java.util.Arrays;

class ArraysDemo {
	public static void main(String... args) {
		long a[] = new long[5];
		for (int i = 0; i < 5; i++)
			a[i] = Math.round(Math.random() * 100);
		Arrays.sort(a);
		for (long n : a)
			System.out.println(n);

		int pos = Arrays.binarySearch(a, 30);
		if (pos >= 0)
			System.out.printf("Found at : %d", pos);
		else
			System.out.println("Not found");
	}
}