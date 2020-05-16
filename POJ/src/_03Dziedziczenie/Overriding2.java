package _03Dziedziczenie;

class AO2 {
	int i, j;

	AO2(int a, int b) {
		i = a;
		j = b;
	}

	void show() {
		System.out.println(" i = " + i + " j = " + j);
	}

	public String toString() {
		return //super.toString() +
				" i = " + i + " j = " + j;
	}
	public  void prr(AO2 a) {
		System.out.println("AO2:" + a);
	}

}

class BO2 extends AO2 {
	int k;

	BO2(int a, int b, int c) {
		super(a, b);
		k = c;
	}

	void show() {
		System.out.println(" k = " + k);
	}

	public String toString() {
		return super.toString() + " k = " + k;
	}
	public  void prr(AO2 a) {
		System.out.println("BO2:" + a);
	}
}

class Overriding2 {
//	public  void prr(BO2 b) {
//		System.out.println("BO2:" + b);
//	}
//
//	public  void prr(AO2 a) {
//		System.out.println("AO2:" + a);
//	}

	public static void main(String args[]) {
		BO2 obB = new BO2(1, 2, 3);
		//AO2 obA = obB;
		AO2 obA = new AO2(3,4);
//		(new Overriding2()).prr(obA);
		obA.prr(obA);
		obB.show();

		System.out.println(obB);
		obA.show();
		System.out.println(obA);
	}
}