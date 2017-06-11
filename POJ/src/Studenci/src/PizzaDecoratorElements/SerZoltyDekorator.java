package PizzaDecoratorElements;

import PizzaDecorator.AbstractProduct;
import PizzaDecorator.AbstractProductDecorator;


public class SerZoltyDekorator extends AbstractProductDecorator{
	public SerZoltyDekorator(AbstractProduct product) {
        super(product);
    }

    @Override
    public String getDescription() {
        return product.getDescription() + ", ser zolty";
    }

    @Override
    public double price() {
        return product.price() + 2.25;
    }
}
