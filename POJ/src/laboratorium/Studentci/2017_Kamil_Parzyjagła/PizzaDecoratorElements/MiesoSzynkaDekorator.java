package PizzaDecoratorElements;

import PizzaDecorator.AbstractProduct;
import PizzaDecorator.AbstractProductDecorator;


public class MiesoSzynkaDekorator extends AbstractProductDecorator{
	public MiesoSzynkaDekorator(AbstractProduct product) {
        super(product);
    }

    @Override
    public String getDescription() {
        return product.getDescription() + ", mieso szynka";
    }

    @Override
    public double price() {
        return product.price() + 7.25;
    }
}
