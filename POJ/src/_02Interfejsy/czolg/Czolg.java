package _02Interfejsy.czolg;

public class Czolg {
	private int numer;
	private String nazwa;
	private Dzialo dzialo;

	public Czolg(int numer, String nazwa, Dzialo dzialo) {
		this.numer = numer;
		this.nazwa = nazwa;
		this.dzialo = dzialo;
	}

	public Czolg(int numer, String nazwa, int kaliber) {
		this(numer, nazwa, new Dzialo(kaliber));
	}

	public Czolg(int numer, String nazwa) {
		this(numer, nazwa, 78);
	}

	public Czolg(int numer) {
		this(numer, "Rudy");
	}

	public Czolg() {
		this(102);
	}

	public Czolg(Czolg czolg) {
		this.numer = czolg.numer;
		this.nazwa = czolg.nazwa;
		//this.dzialo = czolg.getDzialo();
		this.dzialo = new Dzialo(czolg.getDzialo());
	}

	public int getNumer() {
		return numer;
	}

	public void setNumer(int numer) {
		this.numer = numer;
	}

	public String getNazwa() {
		return nazwa;
	}

	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}

	public Dzialo getDzialo() {
		return dzialo;
	}

	public void setDzialo(Dzialo dzialo) {
		this.dzialo = dzialo;
	}

	@Override
	public String toString() {
		return "Czolg{" +
				"numer=" + numer +
				", nazwa='" + nazwa + '\'' +
				", dzialo=" + dzialo +
				'}';
	}
}
