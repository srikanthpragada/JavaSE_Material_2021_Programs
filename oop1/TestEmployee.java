package oop1;

public class TestEmployee {
	public static void main(String[] args) {
		Employee e; // object reference
		e = new Employee(); // create an object of Employee

		e.init("Jonathan", 35000);
		e.print();
		e.setSalary(55000);

		if (e.getSalary() > 50000)
			System.out.println("Fat salary");
	}
}