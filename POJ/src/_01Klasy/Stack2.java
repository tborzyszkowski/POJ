package _01Klasy;


class StackEncapsulation {
	private final int STACK_LIMIT;
	private int[] stackData;
	private int topOfStack;

	StackEncapsulation(int stackLimit) {
		STACK_LIMIT = stackLimit;
		stackData = new int[STACK_LIMIT];
		topOfStack = -1;
	}

	public void push(int item) {
		if (topOfStack == STACK_LIMIT - 1) System.out.println("Stos pelen");
		else stackData[++topOfStack] = item;
	}

	public int pop() {
		if (topOfStack < 0) {
			System.out.println("Stos pusty");
			return 0;
		} else
			return stackData[topOfStack--];
	}
}

class Stack2 {
	public static void main(String args[]) {
		StackEncapsulation myStack1 = new StackEncapsulation(10);
		StackEncapsulation myStack2 = new StackEncapsulation(10);

		for (int i = 0; i < 10; i++) myStack1.push(i);
		for (int i = 0; i < 20; i++) myStack2.push(i);

		System.out.println("Stos myStack1:");
		for (int i = 0; i < 10; i++)
			System.out.println(myStack1.pop());
		System.out.println("Stos myStack2:");
		for (int i = 0; i < 12; i++)
			System.out.println(myStack2.pop());

//		myStack1.topOfStack = -2;
//		myStack2.stackData[3] = 100;

	}
}
