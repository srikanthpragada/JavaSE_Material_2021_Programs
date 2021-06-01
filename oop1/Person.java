package oop1;

class Person {
	protected String name, email;

	public Person(String name, String email) {
		this.name = name;
		this.email = email;
	}

	public void print() {
		System.out.println(this.name);
		System.out.println(this.email);
	}

	public void setEmail(String email) {
		this.email = email;
	}
}

class Teacher extends Person {
	protected String subjects;

	public Teacher(String name, String email, String subjects) {
		super(name, email); // must be first statement
		this.subjects = subjects;
	}

	@Override
	public void print() { // overrides print() of Person
		super.print();
		System.out.println(subjects);
	}

	public void setSubjects(String subjects) {
		this.subjects = subjects;
	}
}