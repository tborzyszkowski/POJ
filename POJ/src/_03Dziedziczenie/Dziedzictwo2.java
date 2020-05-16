package _03Dziedziczenie;

class A2 {
	int i;
	private int j;

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

	public int getJ() {
		return 2 * j;
	}

	public void setJ(int a) {
		j = 3 * a;
	}
}

class B2 extends A2 {
	private int k;

	void setB(int a, int b, int c) {
		setA(a, b);
//		j = a + b;
//		setJ(a + b);
		k = c;
	}

	public String toString() {
		return super.toString() + "\tk = " + k;
	}

	int sumaB() {
		return sumaA() + k;
	}
}

class C22 extends B2 {
	int m;

	void setC(int a, int b, int c, int d) {
		setB(a, b, c);
		m = d;
	}

	public String toString() {
		return super.toString() + "\tm = " + m;
	}

	int sumaC() {
		return sumaB() + m;
	}
}

class Dziedzictwo2 {
	public static void main(String args[]) {
		A2 obA = new A2();
		B2 obB = new B2();
		C22 obC = new C22();

		obA.setA(10, 20);
		obB.setB(1, 2, 3);
		obC.setC(-1, -2, -3, -4);
		obC.setA(-10, -100);

		System.out.println("Zawartosc A: " + obA);
		System.out.println("Zawartosc B: " + obB);
		System.out.println("Zawartosc C: " + obC);

		System.out.println("Suma A: " + obA.sumaA());
		System.out.println("Suma B: " + obB.sumaB());
		System.out.println("Suma C: " + obC.sumaC());

		System.out.println("Suma C z A: " + obC.sumaA());
	}
}
