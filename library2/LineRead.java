package library2;

import java.io.*;

public class LineRead {
	public static void main(String args[]) throws Exception {
		FileReader fr = new FileReader("c:\\names.txt");
		BufferedReader br = new BufferedReader(fr);

		String line;
		line = br.readLine();
		while (line != null) {
			System.out.println(line);
			line = br.readLine();
		}
		br.close();
		fr.close();
	} // end of main
} // end of class