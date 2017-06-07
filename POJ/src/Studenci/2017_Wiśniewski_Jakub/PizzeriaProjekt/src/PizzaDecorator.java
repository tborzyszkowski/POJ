/**
 * Created by Kuba on 10.05.2017.
 */
public class PizzaDecorator extends Pizza{
    protected Pizza  _pizza;
    public PizzaDecorator(Pizza pizza)
    {
        this._pizza=pizza;
    }

    @Override
    public String getComponents() {
        return _pizza.getComponents();
    }

    @Override
    public String getName() {
        return _pizza.getName();
    }

    @Override
    public void setName(String name) {
        _pizza.setName(name);
    }

    @Override
    public void setPrice(double price) {
        _pizza.setPrice(price);
    }

    @Override
    public double getPrice() {
        return _pizza.getPrice();
    }

    @Override
    public int getLevelOfHot() {
        return _pizza.getLevelOfHot();
    }
}


