package laboratorium.lab5.samochody;

import java.time.LocalDateTime;

public class Ogloszenie {
	private Samochod samochod;
	private LocalDateTime dataDodania;

	public Ogloszenie(Samochod samochod, LocalDateTime dataDodania) {
		this.samochod = samochod;
		this.dataDodania = dataDodania;
	}

	public Samochod getSamochod() {
		return samochod;
	}

	public void setSamochod(Samochod samochod) {
		this.samochod = samochod;
	}

	public LocalDateTime getDataDodania() {
		return dataDodania;
	}

	public void setDataDodania(LocalDateTime dataDodania) {
		this.dataDodania = dataDodania;
	}

	@Override
	public String toString() {
		return "Ogłoszenie [\n" + "\t" + samochod + "\n\t" + dataDodania + "]";
	}
}
