package laboratorium.lab5.student;

public class Main {

	public static void main(String[] args) {
		Osoba os = new Osoba("Jan", "Kowalski", 1950, Plec.MEZCZYZNA);
		Student st = new Student("Jan", "Kowalski", 1950, Plec.MEZCZYZNA, "s12345");
		
		System.out.println(os);
		System.out.println(st);
		
	}
}
