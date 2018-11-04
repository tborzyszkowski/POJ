/**
 * Created by Kuba on 14.05.2017.
 */
public class TomatoDecorator extends PizzaDecorator{
    public TomatoDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getComponents() {
        return super.getComponents()+" Tomato";
    }

    @Override
    public double getPrice() {
        return super.getPrice()+2;
    }
}
