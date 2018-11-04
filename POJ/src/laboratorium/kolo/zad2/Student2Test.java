package laboratorium.kolo.zad2;

public class Student2Test {

	public static void main(String[] args) {
		Student2 s1 = new Student2();

		System.out.println(s1);
		
		s1.uczysie(10);
		System.out.println(s1);
		
		Student2 s2 = s1.clone();

		System.out.println(s2);
		
		s1.uczysie(10);
		
		System.out.println(s2);
		System.out.println(s1);
		
	}

}
