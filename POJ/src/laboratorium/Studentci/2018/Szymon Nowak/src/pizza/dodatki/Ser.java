package pizza.dodatki;

import pizza.Pizza;

public class Ser extends Dodatek {

    Pizza pizza;

    public Ser(Pizza pizza) {

        this.pizza = pizza;
    }

    @Override
    public double koszt() {
        return pizza.koszt() + 2;
    }

    @Override
    public String pobierzOpis() {
        return pizza.pobierzOpis() + " z serem";
    }


}
