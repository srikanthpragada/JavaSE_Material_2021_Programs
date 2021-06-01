package oop2;

class StackFullException extends Exception {
	public StackFullException() {
		super("Stack is full"); // exception message
	}
}

class Stack1 {
	public void push(int v) throws StackFullException {
      //if ( condition )
	  //   throw new StackFullException();
	}
}
