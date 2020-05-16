package _03Dziedziczenie;

class A {
	public int x = 7;

	A() { x = 5;}
	A(int x) {this.x = x;}
}

class B extends A {
	public int x = 6;

	B(int a, int b) {// super();
		//i = 1;
//		super(a);
//		super.x = a+1;
		this.x = b;
	}

	B(){}
	
	public String toString() {
		return "A.x = " + super.x + " B.x = " + this.x;
	}
}

class SuperDemo {
	public static void main(String args[]) {
		B obB = new B(1, 2);
//		B obB = new B();
		
		System.out.println(obB);
		System.out.println(obB.x+ "  " + ((A)obB).x);
	}
}
