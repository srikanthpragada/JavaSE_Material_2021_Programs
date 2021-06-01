package oop1;

class Test {
	void m1(int n) {
	}

	void m1(String s) {
	}

	void m1(String s, int n) {
	}

	void m1(int n, String s) {
	}
	// Not allowed as methods differ only by return type
	/*
	 * int m2(int n) {} long m2(int n) {}
	 */
}