package Skladniki;
import Pizze.Pizza;
import Pizze.PizzaDekorator;
public class PomidorDekorator extends PizzaDekorator {
    public PomidorDekorator(Pizza pizza) {
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
