package _06Wyjatki;

import java.util.Random;

class Exc3 {
	public static void main(String args[]) {
		int a = 0, b = 0, c = 0, j = 0;
		Random r = new Random();

		for (int i = 0; i < 100 * 1000 * 1000; i++) {
			try {
				b = r.nextInt();
				c = r.nextInt();
				a = 12345 / (b / c);
			} catch (ArithmeticException e) {
				a = 0;
				j++;
			}
		}
		System.out.println("j = " + j);
	}
}
