package oop2;

class OuterClass {
	private int m1 = 10;

	class InnerClass {
		private int m2 = 20;

		public void print() {
			System.out.printf("m1 =%d m2 =%d", m1, m2);
		}
	}

	public void print() {
		InnerClass obj = new InnerClass();
		obj.print();
	}
}

public class InnerTest {
	public static void main(String args[]) {
		OuterClass obj = new OuterClass();
		obj.print();
	}
}
