package Skladniki;

import Pizze.Pizza;
import Pizze.PizzaDekorator;

public class SerDekorator extends PizzaDekorator {
    public SerDekorator(Pizza pizza) {
        super(pizza);
    }
    public String getSkladniki() {
        return super.getSkladniki() + "Ser ";
    }
    public double getCena() {
        return super.getCena() +1.0 ;
    }
    public int getOstosc() {
        return super.getOstosc() +0 ;
    }
}
