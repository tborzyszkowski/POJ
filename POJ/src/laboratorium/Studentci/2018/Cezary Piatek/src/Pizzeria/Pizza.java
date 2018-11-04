package Pizzeria;

public abstract class Pizza {
	static String opis = "Pizza";
	int ostrosc = 0;
	String wielkosc = "mala";
	
	public String pobierzOpis()
	{
		return opis;
	}
	public int pobierzOstrosc()
	{
		return ostrosc;
	}
	public String pobierzWielkosc()
	{
		return wielkosc;
	}
	public abstract double cena();
}

