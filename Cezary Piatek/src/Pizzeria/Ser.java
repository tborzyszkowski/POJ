package Pizzeria;

public class Ser extends Dekorator {
    Pizza pizza;
    public Ser(Pizza pizza) {
        this.pizza = pizza;
    }
    public String pobierzOpis() {
        return pizza.pobierzOpis() + ", Ser";
    }
    public int pobierzOstrosc()
    {
    	return pizza.pobierzOstrosc() + 0;
    }
    public double cena() {
        return 2 + pizza.cena();
    }
}