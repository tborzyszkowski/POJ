package laboratorium.lab5.student;

public class Wykładowca extends Osoba {
	private String tytul;

	public Wykładowca(String imie, String nazwisko, int rokUrodzenia, Plec plec, String tytul) {
		super(imie, nazwisko, rokUrodzenia, plec);
		this.tytul = tytul;
	}

	@Override
	public String toString() {
		return "Wykładowca [" + super.toString() + " tytul=" + tytul + "]";
	}

	public String getTytul() {
		return tytul;
	}

	public void setTytul(String tytul) {
		this.tytul = tytul;
	}
	
	
	

}
