package library2;

public class ThreadWithLambda {
	public static void main(String[] args) {
		// New thread with lambda expression
		Thread t1 = new Thread(() -> {
			for (int i = 1; i <= 10; i++)
				System.out.println(i);
		});
		t1.start();

		// Method reference 
		Thread t2 = new Thread(ThreadWithLambda::print);
		t2.start();
	}

	static public void print() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
	}
}