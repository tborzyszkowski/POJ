package _03Dziedziczenie;

class AF {
	final void finalMethod() {
		System.out.println("To jest metoda finalna");
	}
}

class BF extends AF {
//	void finalMethod() {
//		System.out.println("To jest nielegalne");
//	}

	public static void main(String args[]) {
		AF a = new AF();
		BF b = new BF();

		a.finalMethod();
		b.finalMethod();
	}
}
