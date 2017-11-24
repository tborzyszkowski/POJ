/**
 * Created by Kuba on 10.05.2017.
 */
public class CheeseDecorator extends PizzaDecorator{
    public CheeseDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getComponents() {
        return super.getComponents()+" Cheese";
    }

    @Override
    public double getPrice() {
        return super.getPrice()+2;
    }
}
