package laboratorium.lab3.osoby;

public class Stypendysta extends Student {
	private double kwotaStypendium;

	public Stypendysta(String imie, String nazwisko, double rok, String plec, String nrIndeksu,
			double kwotaStypendium) {
		super(imie, nazwisko, rok, plec, nrIndeksu);
		this.kwotaStypendium = kwotaStypendium;
	}

	@Override
	public String toString() {
		return "Stypendysta [kwotaStypendium=" + kwotaStypendium +
				" " + super.toString() +"]";
	}

	public double getKwotaStypendium() {
		return kwotaStypendium;
	}

	public void setKwotaStypendium(double kwotaStypendium) {
		this.kwotaStypendium = kwotaStypendium;
	}
}