package Pizzeria;

public class Pepperoni extends Pizza {
	public Pepperoni()
	{
		ostrosc = 5;
		opis = "Pepperoni(salami, papryka ostra, cebula, ser)";
	}
	public double cena() {
		return 25;
	}
	public static String opis() {
		// TODO Auto-generated method stub
		return "Pepperoni(salami, papryka ostra, cebula, ser)";
	}
}