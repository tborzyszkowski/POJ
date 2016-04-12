package laboratorium.lab3.kadry;

import java.util.List;

public class PracownikFizyczny extends Pracownik {
	private double stawkaGodzinowa;
	private int przepracowaneGodziny;
	private List<String> kwalifikacje;
	final private int normaGodzinowa;
	
	public PracownikFizyczny(String imie, String nazwisko, int rokUrodzenia, Pracownik kierownik,
			double stawkaGodzinowa, int przepracowaneGodziny, List<String> kwalifikacje, int normaGodzinowa) {
		super(imie, nazwisko, rokUrodzenia, kierownik);
		this.stawkaGodzinowa = stawkaGodzinowa;
		this.przepracowaneGodziny = przepracowaneGodziny;
		this.kwalifikacje = kwalifikacje;
		this.normaGodzinowa = normaGodzinowa;
	}

	public double getStawkaGodzinowa() {
		return stawkaGodzinowa;
	}

	public void setStawkaGodzinowa(double stawkaGodzinowa) {
		this.stawkaGodzinowa = stawkaGodzinowa;
	}

	public int getPrzepracowaneGodziny() {
		return przepracowaneGodziny;
	}

	public void setPrzepracowaneGodziny(int przepracowaneGodziny) {
		this.przepracowaneGodziny = przepracowaneGodziny;
	}

	public List<String> getKwalifikacje() {
		return kwalifikacje;
	}

	public void setKwalifikacje(List<String> kwalifikacje) {
		this.kwalifikacje = kwalifikacje;
	}

	public int getNormaGodzinowa() {
		return normaGodzinowa;
	}
	
}
