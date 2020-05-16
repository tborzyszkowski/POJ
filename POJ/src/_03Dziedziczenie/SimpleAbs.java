package _03Dziedziczenie;

abstract class A_1 {
	abstract void callMe();

	void callMeToo() {
		System.out.println("A: callMeToo");
		callMe();
	}
}

class B_1 extends A_1 {
	void callMe() {
		System.out.println("B: callMe");
	}

	void callMeToo() {
		super.callMeToo();
		//System.out.println("B: callMeToo");
	}
}

class SimpleAbs {
	public static void main(String args[]) {
		B_1 b = new B_1();
		A_1 a = b;
		//A_1 aa = new A_1();

		b.callMe();
		b.callMeToo();

		a.callMe();
		a.callMeToo();
		((A_1) b).callMeToo();
	}
}
