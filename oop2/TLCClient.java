package oop2;

// Top level class
class TLC {
// static member class 
	static public class SMC {
		public void print() {
			System.out.println("SMC");
		}
	}

	public void print() {
		System.out.println("TLC");
	}
}

public class TLCClient {
	public static void main(String... args) {
		TLC.SMC srec = new TLC.SMC();
		srec.print();
	}
}
