package _03Dziedziczenie;

import java.util.Random;

class A30 {
	int i, j;
	void setA(int a, int b) {
		i = a;
		j = b;
	}
}

class B31 extends A30 {
	int k;

	void setB(int a, int b, int c) {
		setA(a, b);
		k = c;
	}
}

class B32 extends A30 {
	int k;

	void setB(int a, int b, int c) {
		setA(a, b);
		k = c;
	}
}

class Dziedzictwo3 {
	public static void main(String args[]) {
		A30 obA0 = new A30();
		B31 obB1 = new B31();
		B32 obB2 = new B32();

		// ustawiamy wartosci
		obA0.setA(10, 20);
		obB1.setB(1, 2, 3);
		obB2.setB(-1, -2, -3);

		// wypisujemy zawartosc
		System.out.println("Zawartosc A: ");
		System.out.println(" i = " + obA0.i + " j = " + obA0.j);
		System.out.println("Zawartosc B: ");
		System.out.println(" i = " + obB1.i + " j = " + obB1.j + " k = " + obB1.k + "\n");

		// obA bedzie wskazywal na obB
		Random r = new Random();
		Boolean b = r.nextBoolean();
		System.out.println(b);
		if (b)
			obA0 = obB1;
		else
			obA0 = obB2;
		// obB = obA;
		// wypisujemy zawartosc
		System.out.println("Zawartosc A: ");
		System.out.println(" i = " + obA0.i + " j = " + obA0.j);
//		System.out.println(" k = " + obA.k );
		// czy dostepne bedzie k
		System.out.println(" k = " + ((B31)obA0).k);
		System.out.println(obA0.getClass());
		if (obA0 instanceof B31)
			System.out.println(" k = " + ((B31) obA0).k);
		else if (obA0 instanceof B32)
			System.out.println(" k = " + ((B32) obA0).k);
		else
			System.out.println("Zly typ");
	}
}
