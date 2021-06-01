package oop2.p1;

public class A {
	private int v1;
	protected int v2;
	public int v3;
	int v4; // default access
}

class B extends A {
	public void print() {
		// can access v2, v3, v4
	}
}

class C {
	public void print() {
		A obj = new A();
		// can access v2,v3,v4 of obj
	}
}