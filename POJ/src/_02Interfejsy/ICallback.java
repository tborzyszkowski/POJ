package _02Interfejsy;

import java.util.Random;

// przyklad definicji i implementacji interfejsu

interface ICallback {
	void callback(int param);
}

// klasa implementujaca interfejs
class Client implements ICallback {
	// metoda interfejsu musi byl publiczna
	public void callback(int p) {
		System.out.println("callback wywolana z Client: " + p);
	}

	// metoda dodatkowa, nie z interfejsu
	void nonIfaceMeth() {
		System.out.println("Klasa implementujaca interfejs moze takze "
				+ "implementowac metody spoza interfejsu");
	}
}

// klasa testowa
class TestIface {
	public static void main(String args[]) {
		// interfejs jako typ obiektu
		ICallback c = new Client();

		c.callback(42);
//		c.nonIfaceMeth();
		((Client) c).nonIfaceMeth();
	}
}

// inna impementacja interfejsu
class AnotherClient implements ICallback {
	// metoda interfejsu musi byl publiczna
	public void callback(int p) {
		System.out.println("callback wywolana z AnotherClient: " + p);
	}
}

// inna klasa testowa
class TestIface2 {
	public static void main(String args[]) {
		// interfejs jako typ obiektu
		ICallback c;
		Client ob1 = new Client();
		// tu klasa jako typ obiektu
		AnotherClient ob2 = new AnotherClient();

		c = ob1;
		c.callback(33);
		// zmieniamy referencje
		c = ob2;
		c.callback(5);
		
		Random rand = new Random();
		if(rand.nextBoolean())
			c = ob1;
		else
			c = ob2;
		c.callback(55);
		
	}
}
