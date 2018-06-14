package Pizzeria;

public class Srednia extends Dekorator {
    Pizza pizza;
    public Srednia(Pizza pizza) {
        this.pizza = pizza;
    }
    public String pobierzOpis() {
        return pizza.pobierzOpis() + ", srednia";
    }
    public double cena() {
        return 5 + pizza.cena();
    }
	public int pobierzOstrosc() {
		return pizza.pobierzOstrosc() + 0;
	}
}