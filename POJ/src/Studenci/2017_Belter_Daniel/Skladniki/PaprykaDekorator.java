package Skladniki;
import Pizze.Pizza;
import Pizze.PizzaDekorator;
public class PaprykaDekorator extends PizzaDekorator {
    public PaprykaDekorator(Pizza pizza) {
        super(pizza);
    }
    public String getSkladniki() {
        return super.getSkladniki() + " Papryka ";
    }
    public double getCena() {
        return super.getCena() +5 ;
    }
    public int getOstosc() {
        return super.getOstosc() +2 ;
    }

}
