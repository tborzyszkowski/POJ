package laboratorium.lab3.osoby;

public class Osoba {
	private String imie;
	private String nazwisko;
	private double rok;
	private String plec;
	
	public Osoba(String imie, String nazwisko, double rok, String plec) {
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.rok = rok;
		this.plec = plec;
	}

	@Override
	public String toString() {
		return "Osoba [imie=" + imie + ", nazwisko=" + nazwisko + ", rok=" + rok + ", plec=" + plec + "]";
	}

	public String getImie() {
		return imie;
	}

	public void setImie(String imie) {
		this.imie = imie;
	}

	public String getNazwisko() {
		return nazwisko;
	}

	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}

	public double getRok() {
		return rok;
	}

	public void setRok(double rok) {
		this.rok = rok;
	}

	public String getPlec() {
		return plec;
	}

	public void setPlec(String plec) {
		this.plec = plec;
	}
}
