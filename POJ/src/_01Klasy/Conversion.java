package _01Klasy;

// Demonstracja rzutowan typow niezgodnych
class Conversion {
	public static void main(String[] args) {
		byte b;
		int i = 257;
		double d = 323.942;

		System.out.println("\nKonwersja int do byte:");
		b = (byte) i;
		System.out.println("i = " + i + " b = " + b);

		System.out.println("\nKonwersja double do int:");
		i = (int) d;
		System.out.println("d = " + d + " i = " + i);

		System.out.println("\nKonwersja double do byte:");
		b = (byte) d;
		System.out.println("d = " + d + " b = " + b);
	}
}
