/**
 * Created by Kuba on 15.05.2017.
 */
public class MushroomsDecorator extends PizzaDecorator {
    public MushroomsDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getComponents() {return super.getComponents()+" Mushrooms"; }

    @Override
    public double getPrice() {
        return super.getPrice()+2;
    }
}
