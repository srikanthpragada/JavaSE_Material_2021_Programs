package oop1;

// Final Var, method, class and parameter

abstract class Employee4 {
	protected String name, desg;

	public Employee4(String name, String desg) {
		this.name = name;
		this.desg = desg;
	}

	final public String getDesg() {
		return desg;
	}

	final public void setDesg(String desg) {
		this.desg = desg;
	}

	final public String getName() {
		return name;
	}

	public abstract int getPay();
}

class RegularEmployee extends Employee4 {
	protected int salary;

	public RegularEmployee(String name, String desg, int salary) {
		super(name, desg);
		this.salary = salary;
	}

	@Override
	public int getPay() {
		return salary;
	}
}

class Consultant extends Employee4 {
	protected int nohours, hourrate;

	public Consultant(String name, String desg, int nohours, int hourrate) {
		super(name, desg);
		this.nohours = nohours;
		this.hourrate = hourrate;
	}

	@Override
	public int getPay() {
		return nohours * hourrate;
	}
}

public class TestEmployee4 {
	public static void main(String[] args) {
		Employee4 employees[] = { new RegularEmployee("Steve", "Programmer", 25000),
				new Consultant("Kevin", "DBA", 10, 500), new RegularEmployee("Tom", "System Analyst", 45000) };
		for (Employee4 e : employees)
			System.out.printf("%s : %d\n", e.getName(), e.getPay());
	}
}