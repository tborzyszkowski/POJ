package laboratorium.lab3.osoby;

public class MainTest {

	public static void main(String[] args) {
		Student ok = new Student("Michał", "Kunda", 1996, "Mężczyzna", "s14293");
		System.out.println(ok);

		Wykladowca pk = new Wykladowca("Jan", "Kowalski", 1975, "Mężczyzna", "Magister");
		System.out.println(pk);

		Stypendysta ck = new Stypendysta("Katarzyna", "Kos", 1994, "Kobieta", "s14900", 200);
		System.out.println(ck);
	}

}
