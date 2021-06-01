package library2;

import java.io.*;

public class SerializeObject {
	public static void main(String... args) {
		Person p = new Person("Sri", "sri@gmail.com");
		try (FileOutputStream output = new FileOutputStream("srikanth.dat")) {
			ObjectOutputStream outstream = new ObjectOutputStream(output);
			outstream.writeObject(p);
		} catch (Exception ex) {
			System.out.println(ex);
		}
	}
}