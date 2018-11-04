package Pizzeria;

public class Szynka extends Dekorator {
    Pizza pizza;
    public Szynka(Pizza pizza) {
        this.pizza = pizza;
    }
    public String pobierzOpis() {
        return pizza.pobierzOpis() + ", Szynka";
    }
    public int pobierzOstrosc()
    {
    	return pizza.pobierzOstrosc() + 0;
    }
    public double cena() {
        return 2 + pizza.cena();
    }
}