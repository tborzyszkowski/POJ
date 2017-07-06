package PizzaDecoratorElements;

import PizzaDecorator.AbstractProduct;
import PizzaDecorator.AbstractProductDecorator;


public class SerBrakDekorator extends AbstractProductDecorator{
	public SerBrakDekorator(AbstractProduct product) {
        super(product);
    }

    @Override
    public String getDescription() {
        return product.getDescription() + ", brak sera";
    }

    @Override
    public double price() {
        return product.price() + 0.00;
    }
}
