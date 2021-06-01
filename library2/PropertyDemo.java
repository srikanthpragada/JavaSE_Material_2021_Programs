package library2;

import java.util.Properties;
import java.io.*;

public class PropertyDemo {
	public static void main(String[] args) throws Exception {
		Properties p = new Properties();
		p.setProperty("name", "Srikanth");
		p.setProperty("email", "srikanth@gmail.com");
		p.setProperty("phone", "9059057000");
		for (Object k : p.keySet())
			System.out.printf("%s : %s\n", k, p.get(k));

		p.store(new FileWriter("c:\\sri.properties"), "Srikanth Details");
		Properties p2 = new Properties();
		p2.load(new FileReader("c:\\sri.properties"));
		for (Object k : p2.keySet())
			System.out.printf("%s : %s\n", k, p2.get(k));
	}
}