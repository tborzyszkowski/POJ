package _01Klasy;

// Obliczamy pole kola o zadanym promieniu
class Area {
	public static void main(String[] args) {
		double pi = Math.atan(1) * 4;
		float r = 10.0f;
		double rr = 10.0f;
		double p = pi * r * r;
		System.out.println("Pole kola o promieniu " + r + " wynosi " + p);
		// to samo przy uzyciu wbudowanego PI
		p = Math.PI * r * r * 1000 * 1000;
		System.out.println("Pole kola o promieniu " + r + " wynosi " + p);
		System.out.println("Pole kola o promieniu " + r + " wynosi " + (float) p);
	}
}
