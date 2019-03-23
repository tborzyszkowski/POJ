package laboratorium.lab4.metodyStatyczne;

public class Main {
	
	public static void main(String[] args) {
//		StatyczneA.x = 20;
		
		StatyczneA s1 = new StatyczneA(4);
		
		StatyczneA s2 = new StatyczneA(44);
		
		System.out.println(s1);
		System.out.println(s2);
		
		StatyczneA.x = 20;

		System.out.println(s1);
		System.out.println(s2);
		
		StatyczneA.wypisz();
		
		s1.cos();
		s2.cos();

	}

}
