/**
 * Created by Kuba on 15.05.2017.
 */
public class SauceDecorator extends PizzaDecorator {
    public SauceDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getComponents() {
        return super.getComponents()+" Sauce";
    }

    @Override
    public double getPrice() {
        return super.getPrice()+3;
    }

    @Override
    public int getLevelOfHot() {
        return super.getLevelOfHot()+1;
    }
}
