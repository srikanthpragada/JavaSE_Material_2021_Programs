package oop1;

// Program for Overloading vs Overriding
class C1 {
	public void m1(String msg) {
	}

	public void m2(int n) {
	}
}

class C2 extends C1 {
// overloads m1() in class C1
	public void m1() {
	}

// overrides m2() in class C1
	public void m2(int n) {
	}
}