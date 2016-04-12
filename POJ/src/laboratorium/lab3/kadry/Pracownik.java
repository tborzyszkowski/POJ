package laboratorium.lab3.kadry;

abstract public class Pracownik {
	private String imie;
	private String nazwisko;
	private int rokUrodzenia;
	private Pracownik kierownik;
	
	public Pracownik(String imie, String nazwisko, int rokUrodzenia, Pracownik kierownik) {
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.rokUrodzenia = rokUrodzenia;
		this.kierownik = kierownik;
	}

	@Override
	public String toString() {
		return 	"Pracownik(" + imie + 
				", " + nazwisko + 
				", " + rokUrodzenia +
				", " + this.wyplata() + 
				(kierownik == null ? "" : ", \n\tkierownik=\n\t" + kierownik) + 
				")";
	}

	abstract double wyplata();
	
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

	public int getRokUrodzenia() {
		return rokUrodzenia;
	}

	public void setRokUrodzenia(int rokUrodzenia) {
		this.rokUrodzenia = rokUrodzenia;
	}

	public Pracownik getKierownik() {
		return kierownik;
	}

	public void setKierownik(Pracownik kierownik) {
		this.kierownik = kierownik;
	}
}
