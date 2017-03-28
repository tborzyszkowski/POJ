// przyklad rozszerzania interfejsow

interface Aaaa {
	void meth1();

	void meth2();
}

// interfejs Bbb rozszerza interfejs Aaa
// zawiera wiec meth1 i meth2
interface Bbbb extends Aaaa {
	void meth1();

	void meth3();
}

// ta klasa musi implementowac wszystkie metody z A i z B
// abstract
class MyClass implements Bbbb {
	public void meth1() {
		System.out.println("Implementacja metody 1");
	}

	public void meth2() {
		System.out.println("Implementacja metody 2");
	}

	public void meth3() {
		System.out.println("Implementacja metody 3");
	}
}

// klasa testujaca
public class ExtendIF {
	public static void main(String args[]) {
		MyClass ob = new MyClass();
		Aaaa a;
		Bbbb b;
		a = ob;
		b = ob;

		ob.meth1();
		ob.meth2();
		ob.meth3();
		a.meth1();
		a.meth2();
//		a.meth3();
		((Bbbb) a).meth3();
		b.meth1();
		b.meth2();
		b.meth3();
		a = b;
//		b = a;
	}
}
