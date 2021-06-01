package oop1;

public class UseEmployee3 {
	public static void main(String[] args) {
		Employee3 e = new Employee3("Jason", 30000);
		System.out.println(e.getSalary());
		Employee3.setHraper(25);
		System.out.println(e.getSalary());
	}
}