/**
 * Created by Kuba on 15.05.2017.
 */
public class SalamiDecorator extends PizzaDecorator {
    public SalamiDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getComponents() {
        return super.getComponents() +" Salami";
    }

    @Override
    public double getPrice() {
        return super.getPrice()+3;
    }
}
