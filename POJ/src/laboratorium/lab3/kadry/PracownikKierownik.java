package laboratorium.lab3.kadry;

public class PracownikKierownik extends Pracownik {
	private double ryczalt;
	private double premiaProcent;
	private double dodatek;
	private String telefon;
	private String nrPokoju;
	private String dzial;
	
	public PracownikKierownik(String imie, String nazwisko, int rokUrodzenia, Pracownik kierownik, double ryczalt,
			double premiaProcent, double dodatek, String telefon, String nrPokoju, String dzial) {
		super(imie, nazwisko, rokUrodzenia, kierownik);
		this.ryczalt = ryczalt;
		this.premiaProcent = premiaProcent;
		this.dodatek = dodatek;
		this.telefon = telefon;
		this.nrPokoju = nrPokoju;
		this.dzial = dzial;
	}

	@Override
	public String toString() {
		return "PracownikKierownik ["+
				super.toString()+
				", ryczalt=" + ryczalt + 
				", premiaProcent=" + premiaProcent + 
				", dodatek=" + dodatek
				+ ", telefon=" + telefon + 
				", nrPokoju=" + nrPokoju + 
				", dzial=" + dzial + "]";
	}

	public double wyplata(){
		double podstawa = ryczalt + dodatek;
		return podstawa * (1 + premiaProcent/100.0);
	}
	
	public double getRyczalt() {
		return ryczalt;
	}

	public void setRyczalt(double ryczalt) {
		this.ryczalt = ryczalt;
	}

	public double getPremiaProcent() {
		return premiaProcent;
	}

	public void setPremiaProcent(double premiaProcent) {
		this.premiaProcent = premiaProcent;
	}

	public double getDodatek() {
		return dodatek;
	}

	public void setDodatek(double dodatek) {
		this.dodatek = dodatek;
	}

	public String getTelefon() {
		return telefon;
	}

	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}

	public String getNrPokoju() {
		return nrPokoju;
	}

	public void setNrPokoju(String nrPokoju) {
		this.nrPokoju = nrPokoju;
	}

	public String getDzial() {
		return dzial;
	}

	public void setDzial(String dzial) {
		this.dzial = dzial;
	}
	
}
