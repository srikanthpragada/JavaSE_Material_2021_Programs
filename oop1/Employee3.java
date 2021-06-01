package oop1;

public class Employee3 {
	private String name;
	private double salary;
	private static double hraper = 20;

	public Employee3(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getSalary() {
		return salary + salary * hraper / 100;
	}

	public static void setHraper(double hra) {
		hraper = hra;
	}
}