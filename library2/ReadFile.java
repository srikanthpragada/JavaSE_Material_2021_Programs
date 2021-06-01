package library2;

import java.io.FileReader;
import java.util.Scanner;

public class ReadFile {
	public static void main(String args[]) {
		try {
			Scanner s = new Scanner(System.in);
			System.out.println("Enter filename :");
			String filename = s.nextLine();
			FileReader fr = new FileReader(filename);
			int ch; // must be an int as read() returns int
			while (true) {
				ch = fr.read();
				if (ch == -1)
					break;
				System.out.print((char) ch);
			}
			fr.close();
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	} // end of main
} // end of class