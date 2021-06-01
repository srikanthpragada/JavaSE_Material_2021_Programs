package library2;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializeObject {
	public static void main(String[] args) {
// deserialize the object 
		try (FileInputStream input = new FileInputStream("srikanth.dat")) {
			ObjectInputStream instream = new ObjectInputStream(input);
// read object from stream and cast to Person
			Person p = (Person) instream.readObject();
			System.out.println(p.toString());
		} catch (Exception ex) {
			System.out.println(ex);
		}
	}
}