package oop2;

class DaemonThread extends Thread {

	public void run() {
		// code
	}
}

class ThreadMethods {
	public static void main(String args[]) {
		System.out.println("waiting...");
		try {
			Thread.sleep(1000); // will wait for 1000 milliseconds
			// do something
		} catch (InterruptedException ex) {
		}
		// make a thread a daemon
		DaemonThread dt = new DaemonThread();
		dt.setDaemon(true);
		dt.start(); // starts daemon

		ChildThread ct = new ChildThread();
		ct.start();
		try {
			ct.join(); // make current thread wait until ct is dead
			System.out.println("Child completed");
		} catch (InterruptedException ex) {
		}
	}
}