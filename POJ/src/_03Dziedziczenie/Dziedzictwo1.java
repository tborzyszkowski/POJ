package _03Dziedziczenie;

class A1 {
	int i, j;

	void setA(int a, int b) {
		i = a;
		j = b;
	}

	public String toString() {
		return "\ti = " + i + "\tj = " + j;
	}

	int sumaA() {
		return i + j;
	}
}

class B1 extends A1 {
	int k;

	void setB(int a, int b, int c) {
		setA(a, b);
		k = c;
	}

	public String toString() {
		return super.toString() + "\tk = " + k;
	}

	int sumaB() {
		return sumaA() + k;
	}
}

class Dziedzictwo1 {
	public static void main(String[] args) {
		A1 obA = new A1();
		B1 obB = new B1();

		obA.setA(10, 20);
		obB.setB(1, 2, 3);
		obB.setA(-1, -2);
		System.out.println("Zawartosc A: " + obA);
		System.out.println("Zawartosc B: " + obB + "\n");

		System.out.println("Suma A: " + obA.sumaA());
		System.out.println("Suma B: " + obB.sumaB());
		System.out.println("Suma B: " + obB.sumaA() + "\n");
	}
}
