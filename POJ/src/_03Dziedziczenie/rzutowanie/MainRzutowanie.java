package _03Dziedziczenie.rzutowanie;

public class MainRzutowanie {

	public static void main(String[] args) {
		B b = new B(1, 2, 3, 4);
		A a = new A(11, 22);
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println(((A)b));
		
		//a = b;
		//System.out.println(a.k);
		
		//System.out.println(((B)a).k);
		
		System.out.println(a.metoda1());
		System.out.println(((A)b).metoda1());	
	}
}
