package oop2;

interface Task {
	void process();
}

public class AnonymousDemo {
	public static void main(String[] args) {

		Task task = new Task() {
			public void process() {
				System.out.println("Do the process!");
			}
		};

		task.process();
	}
}