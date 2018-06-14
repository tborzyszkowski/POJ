package pizza.dodatki;

import pizza.Pizza;

public class Ananas extends Dodatek {


    Pizza pizza;

    public Ananas(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public double koszt() {
        return pizza.koszt() + 4;
    }

    @Override
    public String pobierzOpis() {
        return pizza.pobierzOpis() + " z ananasem ";
    }

}
