package library2;

import java.util.*;

public class ArrayListDemo {
	public static void main(String args[]) {
		ArrayList nl = new ArrayList();
		nl.add("Ronaldo");
		nl.add("Messi");
		nl.add("Modric");
		nl.add(1, "Hazard");
		// display the list
		for (Object obj : nl)
			System.out.println(obj);

		nl.remove("Ronaldo");
		System.out.println(nl.indexOf("Messi"));
	}
}