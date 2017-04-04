// Przyklad uzycia super do odslaniania nazw

class A {
	public int i;

	A() { i = 5;}
	A(int i) {this.i = i;}
}

class B extends A {
	public int i; // to i przykrywa i z klasy A

	// konstruktor
	B(int a, int b) {
		// i = 1;
		super(a);
		super.i = a+1; // odwolania do i w A
		i = b;
	}

	// reprezentacja napisowa
	public String toString() {
		return "A.i = " + super.i + " B.i = " + this.i;
	}
}

class SuperDemo {
	public static void main(String args[]) {
		B obB = new B(1, 2);

		System.out.println(obB);
		System.out.println(obB.i+ "  " + ((A)obB).i);
	}
}
