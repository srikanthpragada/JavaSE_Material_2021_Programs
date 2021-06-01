package oop2.p2;

import oop2.p1.A;

public class D extends A {
	public void print() {
		// can access v2,v3 
	}
}

class E {
	public void print() {
		A obj = new A();
		// can access v3 of obj only 
	}
}