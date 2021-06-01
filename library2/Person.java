package library2;

import java.io.Serializable;

class Person implements Serializable {
	private String name, email;

	public Person(String name, String email) {
		this.name = name;
		this.email = email;
	}

	public String toString() {
		return name + "," + email;
	}
}