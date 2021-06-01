package library2;

import java.util.TreeSet;

public class SortPersons {

	static class Person implements Comparable<Person> {
		private String name;
		private int age;

		public Person(String name, int age) {
			this.name = name;
			this.age = age;
		}

		public int compareTo(Person other) {
			return this.name.compareTo(other.name);
		}

		public String toString() {
			return name + " - " + age;
		}
	}

	public static void main(String args[]) {
		var people = new TreeSet<Person>();

		people.add(new Person("Larry", 34));
		people.add(new Person("Bill", 44));
		people.add(new Person("Bill", 44));
		people.add(new Person("Mark", 25));
		for (var p : people)
			System.out.println(p);
	}
}