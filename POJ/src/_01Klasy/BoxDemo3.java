package _01Klasy;

// Definicja prostej klasy z metodami i konstruktorami

class Box3 {
	double width;
	double height;
	double depth;

	// konstruktor bez parametrow
	Box3() {
		this.setDim(0, 0, 0); // DRY
	}

	// konstruktor z jednym parametrem
	Box3(int n) {
		this(n, n, n);
		// this.setDim(n, n, n); // DRY
	}

	// konstruktor z parametrami
	Box3(int w, int h, int d) {
		this(2.0 * w, 3 * h, 4 * d);
//		this.setDim(2 * w, 3 * h, 4 * d); // DRY
	}

	// konstruktor z parametrami
	Box3(double width, double height, double depth) {
		this.setDim(width, height, depth);
	}

	Box3(int w, double h, double d) {
		this.setDim(w, h, d);
	}

	Box3(double w, int h, double d) {
		this.setDim(-w, -h, -d);
	}

	// metoda zmieniajaca zawartosc obiektu
	// ale nie bedaca konstruktorem
	// nic nie zwraca, wiec typ wynikowy to void
	void setDim(double w, double h, double d) {
		width = w;
		height = h;
		depth = d;
	}

	// metoda obliczajaca objetosc
	double volume() {
		// tu metoda oddaje obietosc
		return width * height * depth;
	}
}

// definicja klasy demonstrujacej uzycie klasy Box
class BoxDemo3 {
	public static void main(String args[]) {
		// utworzenie instancji klasy Box
		Box3 myBox1 = new Box3();
		Box3 myBox2 = new Box3(2);
		Box3 myBox3 = new Box3(3, 4, 5);
		Box3 myBox4 = new Box3(1.0, 1.0, 1.0);

		// wypisujemy objetosci
		System.out.println("\nObjetosc myBox1 = " + myBox1.volume());
		System.out.println("Objetosc myBox2 = " + myBox2.volume());
		System.out.println("Objetosc myBox3 = " + myBox3.volume());
		System.out.println("Objetosc myBox4 = " + myBox4.volume());

		// zmieniamy zawartosc obiektu myBox1
		myBox1.setDim(2, 3, 2);
		// raz jeszcze jego objetosc
		System.out.println("\nObjetosc myBox1 = " + myBox1.volume() + "\n");
	}
}
