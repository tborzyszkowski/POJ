package pizza.dodatki;

import pizza.Pizza;

public class Szynka extends Dodatek {



    Pizza pizza;

    public Szynka(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public double koszt() {
        return pizza.koszt() + 2;
    }

    @Override
    public String pobierzOpis() {
        return pizza.pobierzOpis() + " z szynka";
    }
}
