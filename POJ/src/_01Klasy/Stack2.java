package _01Klasy;


class StackEncapsulation {
	private final int STACK_LIMIT = 10;
	private int stackData[] = new int[STACK_LIMIT];
	private int topOfStack;

	StackEncapsulation() {
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
		StackEncapsulation myStack1 = new StackEncapsulation();
		StackEncapsulation myStack2 = new StackEncapsulation();

		for (int i = 0; i < 10; i++) myStack1.push(i);
		for (int i = 0; i < 20; i++) myStack2.push(i);

		System.out.println("Stos myStack1:");
		for (int i = 0; i < 10; i++)
			System.out.println(myStack1.pop());
		System.out.println("Stos myStack2:");
		for (int i = 0; i < 12; i++)
			System.out.println(myStack2.pop());

		// dzieki temu, ze stos i wierzcholek sa prywatne
		// nastepujace komendy spowoduja powstanie bledu
		// myStack1.top_of_stack = -2;
		// myStack2.stck[3] = 100;

	}
}
