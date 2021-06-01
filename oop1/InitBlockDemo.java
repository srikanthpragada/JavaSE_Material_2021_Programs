package oop1;

class A {
	// Object initialization block
	{
		System.out.println("Init Block In A");
	}

	public A() {
		System.out.println("Constructor of A");
	}

	// Static initialization block
	static {
		System.out.println("Static Initialization Block Of A");
	}
}

class B extends A {
	public B() {
		System.out.println("Constructor of B");
	}

	public B(String message) {
		System.out.println("Constructor with message : " + message);
	}

	// Object initialization block
	{
		System.out.println("First Init Block In B");
	}

	{
		System.out.println("Second Init Block In B");
	}

	static {
		System.out.println("Static Initialization Block Of B");
	}
}

public class InitBlockDemo {
	public static void main(String[] args) {
		B obj = new B();
		System.out.println("============================");
		B obj2 = new B("Second Object");
	}
}