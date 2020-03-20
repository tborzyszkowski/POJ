package _01Klasy;

class StackWithoutLimits {
	private int stackData[];
	private int topOfStack;

	StackWithoutLimits(int sizeOfStack) {
		stackData = new int[sizeOfStack];
		topOfStack = -1;
	}

	int size() {
		return stackData.length;
	}

	void push(int item) {
		if (topOfStack == stackData.length - 1)
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

class StackTest {
	public static void main(String args[]) {
		StackWithoutLimits myStack1 = new StackWithoutLimits(5);
		StackWithoutLimits myStack2 = new StackWithoutLimits(8);

		for (int i = 0; i < myStack1.size(); i++)
			myStack1.push(i);
		for (int i = 0; i < myStack2.size(); i++)
			myStack2.push(i);

		System.out.println("Stos myStack1:");
		for (int i = 0; i < myStack1.size(); i++)
			System.out.println(myStack1.pop());
		System.out.println("Stos myStack2:");
		for (int i = 0; i < myStack2.size(); i++)
			System.out.println(myStack2.pop());
	}
}