package _01Klasy;

// Obliczamy odleglosc jaka przebedzie swiatlo w zadanym czasie
// uzywajac zmiennych typu long
class LightTravel {
	public static void main(String args[]) {
		int lightSpeed = 299792; // km/s
		long days = 100 * 1000 * 1000;        // badana liczba dni
		long seconds = days * 24 * 60 * 60;   // tyle to sekund
		long distance = lightSpeed * seconds; // tyle przebedzie swiatlo

		// teraz odpowiedz
		System.out.print("W ciagu " + days);
		System.out.print(" dni swiatlo przebedzie okolo ");
		System.out.println("\n" + distance + " kilometrow");
		long distance2 = Math.multiplyExact(lightSpeed, seconds);
		System.out.println("\n" + distance2 + " kilometrow");
		System.out.println(Long.MAX_VALUE);
		//byte a = 1;
		//byte b = 1*a;
	}
}
