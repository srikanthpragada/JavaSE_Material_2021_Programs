package gettingstarted;

//program to display command-line parameters
public class CLA {
	public static void main(String args[]) {
		System.out.printf("Args Count: %d\n", args.length);
		// display parameters
		for (String s : args)
			System.out.println(s);
	} // end of main
}

/* The following code is same as the code above
 * public class CLA { public static void main(String a[]) {
 *      for (String s : a)
 *         System.out.println(s); 
 *   } 
 * }
 */