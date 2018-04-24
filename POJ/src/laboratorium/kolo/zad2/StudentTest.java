package laboratorium.kolo.zad2;

public class StudentTest {

	public static void main(String[] args) {
		Student s1 = new Student();

		System.out.println(s1);
		
		s1.uczysie(10);
		System.out.println(s1);
		
		Student s2 = s1.clone();

		System.out.println(s2);
		
		s1.uczysie(10);
		
		System.out.println(s2);
		System.out.println(s1);
	}

}
