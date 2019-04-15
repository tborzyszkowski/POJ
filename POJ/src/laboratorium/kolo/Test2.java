package laboratorium.kolo;

class A2 {
	static String s = "";
	void f() { s += "Af "; }
	void g() { s += "Ag "; this.f(); }
}

class B2 extends A2 {
	void f() { s += "Bf "; }
	void h() { s += "Bh "; super.f(); }
}

class C2 extends B2 {
	void f() { s += "Cf "; super.h(); }
	void g() { s += "Cg "; super.g(); }
}
class Test2 {
	public static void main(String[] args) {
		A2 a = new A2(); a.f(); a.g();
		B2 b = new B2(); b.f(); b.h();
		C2 c = new C2(); c.f(); c.h(); c.g();
		System.out.println(A2.s);
	}
}