/**
 * Created by Kuba on 14.05.2017.
 */
public class PepperDecorator extends PizzaDecorator {
    public PepperDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getComponents() {
        return super.getComponents() + " Pepper";
    }

    @Override
    public double getPrice() {
        return super.getPrice()+2;
    }
}
