package Skladniki;
import Pizze.Pizza;
import Pizze.PizzaDekorator;
public class PieczarkiDekorator extends PizzaDekorator {
    public PieczarkiDekorator(Pizza pizza) {
        super(pizza);
    }
    public String getSkladniki() {
        return super.getSkladniki() + " Pomidor ";
    }
    public double getCena() {
        return super.getCena() +1.0 ;
    }
    public int getOstosc() {
        return super.getOstosc() +0 ;
    }
}
