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

	@Override
	public String toString() {
		return "PracownikFizyczny [stawkaGodzinowa=" + stawkaGodzinowa + ", przepracowaneGodziny="
				+ przepracowaneGodziny + ", kwalifikacje=" + kwalifikacje + ", normaGodzinowa=" + normaGodzinowa + "]";
	}

	public int przepracowaneNadgodziny(){
		// ( warunek ? wartosc dla True : wartosc dla False )
		return (normaGodzinowa >= przepracowaneGodziny ? 0 : przepracowaneGodziny - normaGodzinowa);
	}
	
	public double wyplata(){
		int zwykleGodziny = (przepracowaneGodziny<=normaGodzinowa ? przepracowaneGodziny : normaGodzinowa);
		return zwykleGodziny * stawkaGodzinowa + 
				przepracowaneNadgodziny() * stawkaGodzinowa * 1.1;
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
