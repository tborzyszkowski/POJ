package Skladniki;

import Pizze.Pizza;
import Pizze.PizzaDekorator;
public class SzynkaDekorator extends PizzaDekorator {
    public SzynkaDekorator(Pizza pizza) {
        super(pizza);
    }
    public String getSkladniki() {
        return super.getSkladniki() + "Szynka ";
    }
    public double getCena() {
        return super.getCena() +5 ;
    }
    public int getOstosc() {
        return super.getOstosc() +0 ;
    }

}
