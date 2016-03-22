package laboratorium.lab1.koszyk;

public class Produkt {
	String kod;
	String nazwa;
	double cena;
	
	public Produkt(String kod, String nazwa, double cena) {
		this.kod = kod;
		this.nazwa = nazwa;
		this.cena = cena;
	}
	
	public String toString(){
		return "<Produkt: "+this.kod+" : "+
				this.nazwa+" : "+this.cena+">";
	}
	
}
