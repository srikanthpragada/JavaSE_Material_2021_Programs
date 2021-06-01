package library2;

import java.io.RandomAccessFile;

public class RandomAccessDemo {
	public static void main(String[] args) throws Exception {
		int phonenumbers[] = { 1111111, 2222222, 3333333, 444444 };
		RandomAccessFile raf = new RandomAccessFile("c:\\java\\numbers.dat", "rw");
		// write numbers into file 
		for (int n : phonenumbers)
			raf.writeInt(n);
		// read numbers from file
		raf.seek(0); // start at the beginning
		int count = (int) raf.length() / 4;

		for (int i = 0; i < count; i++)
			System.out.println(raf.readInt());

		// modify a number in the file 
		raf.seek(2 * 4); // go to third number
		raf.writeInt(9999999); // write new number

		// display numbers once again
		raf.seek(0);
		for (int i = 0; i < count; i++)
			System.out.println(raf.readInt());
	}
}