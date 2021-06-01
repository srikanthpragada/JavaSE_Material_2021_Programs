package library2;

import java.util.*;

public class CollectionsDemo {
	public static void main(String args[]) {
		ArrayList<String> names = new ArrayList<>();
		names.add("James Goodwill");
		names.add("Jason Hunter");
		names.add("Roman");
		Collections.sort(names);
		printList(names);
		int pos = Collections.binarySearch(names, "Roman");
		System.out.printf("Roman is found at : %d\n", pos);
		System.out.printf("Maximum :%s\n", Collections.max(names));
		System.out.println("Reverse Order");
		Collections.reverse(names);
		printList(names);
	}

	public static void printList(List<String> list) {
		for (String s : list) {
			System.out.println(s);
		}
	}
}