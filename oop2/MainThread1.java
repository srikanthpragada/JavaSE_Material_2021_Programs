package oop2;

//Multi-threading using subclass of Thread class
class ChildThread extends Thread {
	@Override
	public void run() {
		for (int i = 1; i <= 50; i++) {
			System.out.println("Child -> " + i);
		}
	} // end of run
} // end of ChildThread

public class MainThread1 {
	public static void main(String args[]) {
		System.out.println("In Main");
		ChildThread ct1 = new ChildThread();
		ct1.start(); // run thread

		System.out.println("In Main again");
		for (int i = 1; i <= 50; i++) {
			System.out.println("Main -->" + i);
		} // end of for

		System.out.println("End of main");
	} // end of main()
}
