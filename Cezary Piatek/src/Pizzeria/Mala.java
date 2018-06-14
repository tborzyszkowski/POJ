package Pizzeria;

public class Mala extends Dekorator {
    Pizza pizza;
    public Mala(Pizza pizza) {
        this.pizza = pizza;
    }
    public String pobierzOpis() {
        return pizza.pobierzOpis() + ", mala";
    }
    public double cena() {
        return 0 + pizza.cena();
    }
	public int pobierzOstrosc() {
		return pizza.pobierzOstrosc() + 0;
	}
}