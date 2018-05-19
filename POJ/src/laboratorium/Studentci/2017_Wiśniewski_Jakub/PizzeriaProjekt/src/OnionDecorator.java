/**
 * Created by Kuba on 10.05.2017.
 */
public class OnionDecorator extends PizzaDecorator{
    public OnionDecorator(Pizza pizza) {
        super(pizza);
    }
    @Override
    public String getComponents() { return super.getComponents()+" Onion"; }

    @Override
    public double getPrice() {
        return super.getPrice()+2;
    }

    @Override
    public int getLevelOfHot() {
        return super.getLevelOfHot()+1 ;
    }
}
