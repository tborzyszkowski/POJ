package laboratorium.kolo.zad2;

public class A {
	protected int x = 1;
}

class BB extends A{
	private int y = 2;
}

class Test {
	static void met1(A a) {
		a.x = 3;
	}
	static void met2(BB b) {
		b.x = 3;
	}
	
	public static void main(String[] args) {
		A aa = new BB();
		
		System.out.println(aa.x);
		
//		A a = new BB();
//		System.out.println(((BB)a).y);
	}
}