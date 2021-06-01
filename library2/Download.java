package library2;

import java.net.*;
import java.io.*;
import java.util.Scanner;

class Download {
	public static void main(String args[]) throws Exception {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter URL : ");
		String fromurl = s.nextLine();
		System.out.print("Enter filename : ");
		String filename = s.nextLine();
		URL urlobj = new URL(fromurl);
		InputStream is = urlobj.openStream();
		FileOutputStream fo = new FileOutputStream(filename);
		while (true) {
			int ch = is.read();
			if (ch == -1)
				break;
			fo.write(ch);
		}
		fo.close();
		is.close();
	}
}