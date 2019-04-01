package laboratorium.lab5.samochody;

public class Samochod {
	private String marka;
	private String model;
	private int rocznik;
	private int przebieg;

	public Samochod(String marka, String model, int rocznik, int przebieg) {
		this.marka = marka;
		this.model = model;
		this.rocznik = rocznik;
		this.przebieg = przebieg;
	}
	public Samochod() {}
	
	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getRocznik() {
		return rocznik;
	}

	public void setRocznik(int rocznik) {
		this.rocznik = rocznik;
	}

	public int getPrzebieg() {
		return przebieg;
	}

	public void setPrzebieg(int przebieg) {
		this.przebieg = przebieg;
	}

	@Override
	public String toString() {
		return "Samochod [marka=" + marka + ", model=" + model + ", rocznik=" + rocznik + ", przebieg=" + przebieg
				+ "]";
	}
}
