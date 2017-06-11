package PizzaDecoratorElements;

import PizzaDecorator.AbstractProduct;
import PizzaDecorator.AbstractProductDecorator;


public class WarzywaBrakDekorator extends AbstractProductDecorator{
	public WarzywaBrakDekorator(AbstractProduct product) {
        super(product);
    }

    @Override
    public String getDescription() {
        return product.getDescription() + ", brak warzyw";
    }

    @Override
    public double price() {
        return product.price() + 0.00;
    }
}
