/**
 * Created by Kuba on 15.05.2017.
 */
public class HamDecorator extends PizzaDecorator {
    public HamDecorator(Pizza pizza) {super(pizza); }

    @Override
    public String getComponents() {
        return super.getComponents()+ " Ham";
    }

    @Override
    public double getPrice() {
        return super.getPrice()+3;
    }
}
