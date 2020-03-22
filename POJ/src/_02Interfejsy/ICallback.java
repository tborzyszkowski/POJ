package _02Interfejsy;

import java.util.Random;

interface ICallback {
	void callback(int param);
}
class Client implements ICallback {
	public void callback(int p) {
		System.out.println("callback wywolana z Client: " + p);
	}
	void nonIfaceMeth() {
		System.out.println("Klasa implementujaca interfejs moze takze "
				+ "implementowac metody spoza interfejsu");
	}
}
class TestIface {
	public static void main(String args[]) {
		ICallback c = new Client();

		c.callback(42);
//		c.nonIfaceMeth();
		((Client) c).nonIfaceMeth();
	}
}

class AnotherClient implements ICallback {
	public void callback(int p) {
		System.out.println("callback wywolana z AnotherClient: " + p);
	}
}

class TestIface2 {
	public static void main(String args[]) {
		ICallback c;
		Client ob1 = new Client();
		AnotherClient ob2 = new AnotherClient();

		c = ob1;
		c.callback(33);
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
