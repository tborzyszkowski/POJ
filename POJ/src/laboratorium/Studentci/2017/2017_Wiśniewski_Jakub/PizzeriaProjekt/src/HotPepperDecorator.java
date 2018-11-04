/**
 * Created by Kuba on 15.05.2017.
 */
public class HotPepperDecorator extends PizzaDecorator {
    public HotPepperDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getComponents() {
        return super.getComponents()+ " Hot Pepper";
    }

    @Override
    public double getPrice() {
        return super.getPrice()+3;
    }

    @Override
    public int getLevelOfHot() {
        return super.getLevelOfHot()+4;
    }
}
