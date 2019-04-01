package _03Dziedziczenie;

import java.util.Random;

class A003 {
	int i;

	void setA(int i) {
		this.i = i;
	}

	@Override
	public String toString() {
		return "A003 [i=" + i + "]";
	}
	
}

class B0031 extends A003 {
	int j;

	void setB(int i, int j) {
		setA(i);
		this.j = j;
	}

	@Override
	public String toString() {
		return "B0031 [j=" + j + ", i=" + i + "]";
	}
	
}

class B0032 extends A003 {
	int j;

	void setB(int i, int j) {
		setA(i);
		this.j = j;
	}

	@Override
	public String toString() {
		return "B0032 [j=" + j + ", i=" + i + "]";
	}
	
}

class Dziedzictwo3 {
	public static void main(String args[]) {
		A003  obA0 = new A003();
		B0031 obB1 = new B0031();
		B0032 obB2 = new B0032();

		// ustawiamy wartosci
		obA0.setA(10);
		obB1.setB(1, 2);
		obB2.setB(-1, -2);

		// wypisujemy zawartosc
		System.out.println("Zawartosc A:  " + obA0);
		System.out.println("Zawartosc B1: " + obB1);
		System.out.println("Zawartosc B2: " + obB2);

		Random r = new Random();
		Boolean b = r.nextBoolean();
		System.out.println(b);
		if (b)
			obA0 = obB1;
		else
			obA0 = obB2;
//		 obB = obA;
		
		System.out.println("Zawartosc A:  " + obA0);

//		 System.out.println(" j = " + obA0.j );

//		 System.out.println(" j = " + ((B0031)obA0).j);
		 
		System.out.println(obA0.getClass());
		
		if (obA0 instanceof B0031)
			System.out.println("B0031: j = " + ((B0031) obA0).j);
		else if (obA0 instanceof B0032)
			System.out.println("B0032: j = " + ((B0032) obA0).j);
		else
			System.out.println("Zly typ");

		// if(obA0.getClass().equals(obB1.getClass())) {
		//
		// }

	}
}
