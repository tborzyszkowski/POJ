package laboratorium.lab5.samochody;

import java.time.LocalDateTime;

public class Ogloszenie {
	private Samochod samochod;
	private double cena =100;
	private LocalDateTime dataDodania;

	public Ogloszenie(Samochod samochod, LocalDateTime dataDodania) {
		this.samochod = samochod;
		this.dataDodania = dataDodania;
	}

	public Ogloszenie(Samochod samochod, double cena, LocalDateTime dataDodania) {
		this.samochod = samochod;
		this.cena = cena;
		this.dataDodania = dataDodania;
	}

	public Samochod getSamochod() {
		return samochod;
	}

	public void setSamochod(Samochod samochod) {
		this.samochod = samochod;
	}

	public double getCena() {
		return cena;
	}

	public void setCena(double cena) {
		this.cena = cena;
	}

	public LocalDateTime getDataDodania() {
		return dataDodania;
	}

	public void setDataDodania(LocalDateTime dataDodania) {
		this.dataDodania = dataDodania;
	}

	@Override
	public String toString() {
		return "Ogłoszenie [\n" + "\t" + samochod + "\n\t" + cena+ "\n\t" + dataDodania + "]";
	}
}
