package laboratorium.lab5.student;

public class Stypendysta extends Student {
	private int kwotaStypendium;

	public Stypendysta(String imie, String nazwisko, int rokUrodzenia, Plec plec, String numerIndeksu,
			int kwotaStypendium) {
		super(imie, nazwisko, rokUrodzenia, plec, numerIndeksu);
		this.kwotaStypendium = kwotaStypendium;
	}

	@Override
	public String toString() {
		return "Stypendysta [" + super.toString() + " kwotaStypendium=" + kwotaStypendium + "]";
	}

	public int getKwotaStypendium() {
		return kwotaStypendium;
	}

	public void setKwotaStypendium(int kwotaStypendium) {
		this.kwotaStypendium = kwotaStypendium;
	}
	
	
}
