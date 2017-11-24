package Skladniki;
import Pizze.Pizza;
import Pizze.PizzaDekorator;
public class CebulaDekorator extends PizzaDekorator {
    public CebulaDekorator(Pizza pizza) {
        super(pizza);
    }
    public String getSkladniki() {
        return super.getSkladniki() + " Cebula ";
    }
    public double getCena() {
        return super.getCena() +1.0 ;
    }
    public int getOstosc() {
        return super.getOstosc() +0 ;
    }
}
