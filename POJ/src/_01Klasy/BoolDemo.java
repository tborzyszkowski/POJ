package _01Klasy;

// demonstracja typu boolean
class BoolDemo {
	public static void main(String[] args) {
		boolean b;

		b = false;
		System.out.println("b = " + b);
		b = true;
		System.out.println("b = " + b);
		System.out.println("1+1 = " + 1 + 1);

		// wyrazenia typu boolean kontroluja wykonanie komendy if
		if (b)
			System.out.println(" To zobaczymy ");

		b = false;
		if (b)
			System.out.println(" ... a tego nie  zobaczymy ");

		// wynikiem realacji jest wartosc logiczna
		// b = 1;
		System.out.println("(1 > 2) == " + (1 > 2));
	}
}
