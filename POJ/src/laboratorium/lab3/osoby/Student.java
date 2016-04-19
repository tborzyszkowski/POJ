package laboratorium.lab3.osoby;

public class Student extends Osoba {
	private String nrIndeksu;

	public Student(String imie, String nazwisko, double rok, String plec, String nrIndeksu) {
		super(imie, nazwisko, rok, plec);
		this.nrIndeksu = nrIndeksu;
	}

	@Override
	public String toString() {
		return "Student [nrIndeksu=" + nrIndeksu +
				" " + super.toString()+ "]";
	}

	public String getNrIndeksu() {
		return nrIndeksu;
	}

	public void setNrIndeksu(String nrIndeksu) {
		this.nrIndeksu = nrIndeksu;
	}
}
