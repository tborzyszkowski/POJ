package laboratorium.lab1.koszyk;

public class Produkt {
	String kod;
	String nazwa;
	double cena;
	double cenaPromocyjna;
	
	public Produkt(String kod, String nazwa, double cena, double cenaPromocyjna) {
		this.kod = kod;
		this.nazwa = nazwa;
		this.cena = cena;
		this.cenaPromocyjna = cenaPromocyjna;
	}
	
	public String toString(){
		return "<Produkt: "+this.kod+" : "+
				this.nazwa+"("+this.cena+", "+ this.cenaPromocyjna+")>";
	}
	
}
