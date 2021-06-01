package oop2;

class UseMyStack {
	public static void main(String[] args) {
		MyStack ms = new MyStack();
		ms.push("First");
		ms.push("Second");
	    ms.print();
		System.out.println(ms.pop());
		
	}
}
