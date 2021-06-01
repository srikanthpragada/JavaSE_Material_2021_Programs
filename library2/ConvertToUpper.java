package library2;

import java.io.*;
import java.util.Scanner;

public class ConvertToUpper {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter source filename :");
		String srcfile = s.nextLine();
		System.out.println("Enter target filename :");
		String trgfile = s.nextLine();

		try (FileReader fr = new FileReader(srcfile);
			 FileWriter fw = new FileWriter(trgfile)) {
			BufferedReader br = new BufferedReader(fr);
			String line;
			while (true) {
				line = br.readLine();
				if (line == null)
					break;
				fw.write(line.toUpperCase() + "\n");
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}