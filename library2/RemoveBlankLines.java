package library2;

import java.io.*;
import java.nio.file.*;
import java.util.Scanner;

public class RemoveBlankLines {
	public static void main(String[] args) throws Exception {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Source Filename : ");
		String srcfile = s.nextLine();
		Path src = Paths.get(srcfile);
		BufferedReader br = Files.newBufferedReader(src);

		Path trg = Paths.get("tempfile.txt");
		BufferedWriter bw = Files.newBufferedWriter(trg, StandardOpenOption.CREATE);
		while (true) {
			String line = br.readLine();
			if (line == null)
				break;
			if (line.length() > 0) // non blank line
				bw.write(line + "\n");
		}
		bw.close();
		br.close();
		Files.move(trg, src, StandardCopyOption.REPLACE_EXISTING);
		s.close();
	}
}