package Pizzeria;

public class Capricciosa extends Pizza {

	public Capricciosa()
	{
		ostrosc = 1;
		opis = "Capricciosa (sos, pieczarki, szynka)";
	}
	public double cena() {
		return 22;
	}
	public static String opis() {
		
		return "Capricciosa (sos, pieczarki, szynka)";
	}
}
