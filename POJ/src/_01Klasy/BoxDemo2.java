package _01Klasy;

// Definicja prostej klasy (tylko dane, zadnych metod)

class Box1 {
	double width;
	double height;
	double depth;
}

// definicja klasy demonstrujacej uzycie klasy Box dwa razy

class BoxDemo2 {
	public static void main(String args[]) {
		// utworzenie dwoch instancji klasy Box
		Box1 myBox1 = new Box1();
		Box1 myBox2 = new Box1();
//		Box1 myBox2 = myBox1;
		double vol;

		// wpisujemy dane do myBox1
		myBox1.width = 10;
		myBox1.height = 20;
		myBox1.depth = 15;
		// wpisujemy dane do myBox2
		myBox2.width = 2;
		myBox2.height = 3;
		myBox2.depth = 4;

		// obliczamy objetosc myBox1
		vol = myBox1.width * myBox1.height * myBox1.depth;

		System.out.println("Objetosc myBox1 = " + vol);

		// obliczamy objetosc myBox2
		vol = myBox2.width * myBox2.height * myBox2.depth;

		System.out.println("Objetosc myBox2 = " + vol);
	}
}
