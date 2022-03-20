package _01Klasy;

class StackWithoutLimits {
	private int[] stackData;
	private int topOfStack;

	public StackWithoutLimits(int sizeOfStack) {
		stackData = new int[sizeOfStack];
		topOfStack = -1;
	}

	public int size() {
		return stackData.length;
	}

	public void push(int item) {
		if (topOfStack == stackData.length - 1) {
			int[] temp = new int[2 * stackData.length];
			for (int i = 0; i < stackData.length; i++)
				temp[i] = stackData[i];
			stackData = temp;
		}
		stackData[++topOfStack] = item;
	}

	public int pop() {
		if (topOfStack < 0) {
			System.out.println("Stos pusty");
			return 0;
		} else
			return stackData[topOfStack--];
	}
}

class StackTest {
	public static void main(String[] args) {
		StackWithoutLimits myStack1 = new StackWithoutLimits(5);
		StackWithoutLimits myStack2 = new StackWithoutLimits(8);

		for (int i = 0; i < myStack1.size(); i++)
			myStack1.push(i);
		myStack1.push(101);
		myStack1.push(222);

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