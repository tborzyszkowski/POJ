package Pizzeria;

public class Duza extends Dekorator {
    Pizza pizza;
    public Duza(Pizza pizza) {
        this.pizza = pizza;
    }
    public String pobierzOpis() {
        return pizza.pobierzOpis() + ", duza";
    }
    public double cena() {
        return 10 + pizza.cena();
    }
	public int pobierzOstrosc() {
		return pizza.pobierzOstrosc() + 0;
	}
}