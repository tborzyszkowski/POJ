package laboratorium.kolo.student;

public class Main {

	public static void main(String[] args) {
		Student s1 = new Student();
		
		s1.uczysie(10);
		s1.uczysie(5);
		
		System.out.println(s1);

		s1.uczysie(15);
		System.out.println(s1);
		
		Student s2 = new Student(s1);
		s2.uczysie(25);
		System.out.println(s1);
		System.out.println(s2);
		
	}

}
