package laboratorium.lab5.student;

public class Student extends Osoba {
	private String  numerIndeksu;

	public Student(String imie, String nazwisko, int rokUrodzenia, Plec plec, String numerIndeksu) {
		super(imie, nazwisko, rokUrodzenia, plec);
		this.numerIndeksu = numerIndeksu;
	}

	@Override
	public String toString() {
		return "Student [" + super.toString() + " numerIndeksu=" + numerIndeksu + "]";
	}

	public String getNumerIndeksu() {
		return numerIndeksu;
	}

	public void setNumerIndeksu(String numerIndeksu) {
		this.numerIndeksu = numerIndeksu;
	}
	
	
}
