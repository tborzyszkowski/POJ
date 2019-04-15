package _05Kolekcje;

import java.util.*;

class Stack33<T> {
	private ArrayList<T> items;

	public Stack33(int size) {
		items = new ArrayList<T>(size);
	}

	void push(T item) {
		items.add(item);
	}

	public T pop() {
		int len = items.size();
		T obj = null;
		if (len == 0)
			throw new EmptyStackException();
		obj = items.get(len - 1);
		items.remove(len - 1);
		return obj;
	}

	public boolean isEmpty() {
		return items.isEmpty();
	}
	
	public int size(){
		return items.size();
	}
}

// Klasa testujaca stos
class Stack_1G {
	public static void main(String args[]) {
		Stack33<Number> myStack = new Stack33<>(10);

		// wkladamy liczby na stos
		for (int i = 0; i < 15; i++)
			myStack.push(new Integer(i));

		// TU otrzymamy blad
		 myStack.push(new Long(5));
		// myStack.push("Ala ma kota");
		
		System.out.println("Czy stos jest pusty? : " + myStack.isEmpty());

		// zdejmujemy ze stosu
		System.out.println("Stos myStack:");
		for (int i = 0; i < myStack.size(); i++)
			System.out.println(myStack.pop().intValue()+1);

		System.out.println("Czy stos jest pusty? : " + myStack.isEmpty());
	}
}
