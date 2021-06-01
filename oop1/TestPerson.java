package oop1;

class TestPerson {
	public static void main(String args[]) {
		Teacher t = new Teacher("Srikanth", "srikanthpragada@yahoo.com", "Java, .Net");
		t.print();
		t.setEmail("srikanthpragada@gmail.com");
		t.setSubjects("Java, .Net, Python, DS");
	}
}