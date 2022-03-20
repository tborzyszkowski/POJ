package _01Klasy;

class StackWithoutEncapsulation {
	final int STACK_LIMIT = 10;
	int[] stackData = new int[STACK_LIMIT];
	int topOfStack;

	StackWithoutEncapsulation() {
		topOfStack = -1;
	}

	void push(int item) {
		if (topOfStack == STACK_LIMIT - 1)
			System.out.println("Stos pelen");
		else
			stackData[++topOfStack] = item;
	}

	int pop() {
		if (topOfStack < 0) {
			System.out.println("Stos pusty");
			return 0;
		} else
			return stackData[topOfStack--];
	}
}

class StackTest1 {
	public static void main(String[] args) {
		StackWithoutEncapsulation firstStack = new StackWithoutEncapsulation();
		StackWithoutEncapsulation secondStack = new StackWithoutEncapsulation();

		for (int i = 0; i < 10; i++)
			firstStack.push(i);
		for (int i = 0; i < 20; i++)
			secondStack.push(i);

		firstStack.stackData[2] = 117;

		System.out.println("Stos firstStack:");
		for (int i = 0; i < 10; i++)
			System.out.println(firstStack.pop());
		System.out.println("Stos secondStack:");
		for (int i = 0; i < 10; i++)
			System.out.println(secondStack.pop());
	}
}
