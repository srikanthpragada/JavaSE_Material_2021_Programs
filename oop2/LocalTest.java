package oop2;

class TLC1 {
	private int v = 10;

public void somemethod() {
class LocalClass {
public void print() {
System.out.printf("Local class. Outer class value %d\n",v);
}
}
// use class here
LocalClass obj = new LocalClass();
obj.print();
} // end of method
} // end of TLC

public class LocalTest {
	public static void main(String[] args) {
		TLC1 obj = new TLC1();
		obj.somemethod();
	}
}