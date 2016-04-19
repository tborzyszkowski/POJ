package laboratorium.lab3.osoby;

public class Wykladowca extends Osoba {
	private String tytulNaukowy;

	public Wykladowca(String imie, String nazwisko, double rok, String plec, String tytulNaukowy) {
		super(imie, nazwisko, rok, plec);
		this.tytulNaukowy = tytulNaukowy;
	}

	@Override
	public String toString() {
		return "Wykladowca [tytulNaukowy=" + tytulNaukowy +
				" " + super.toString()+ "]";
	}

	public String getTytulNaukowy() {
		return tytulNaukowy;
	}

	public void setTytulNaukowy(String tytulNaukowy) {
		this.tytulNaukowy = tytulNaukowy;
	}	
}
