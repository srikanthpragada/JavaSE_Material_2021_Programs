package oop2;

class ThreadCode implements Runnable {
	public void run() {
		for (int i = 1; i <= 50; i++) {
			System.out.println(i);
		}
	} // end of run
} // end of ThreadCode

public class RunnableThread {
	public static void main(String args[]) {
		ThreadCode code = new ThreadCode();
		Thread t = new Thread(code);
		t.start(); // Calls run() method of code object

		for (int i = 1; i <= 50; i++)
			System.out.println("Main --> " + i);
	}
}