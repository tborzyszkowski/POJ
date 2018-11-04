package PizzaDecoratorElements;

import PizzaDecorator.AbstractProduct;
import PizzaDecorator.AbstractProductDecorator;


public class MiesoBrakDekorator extends AbstractProductDecorator{
	public MiesoBrakDekorator(AbstractProduct product) {
        super(product);
    }

    @Override
    public String getDescription() {
        return product.getDescription() + ", brak miesa";
    }

    @Override
    public double price() {
        return product.price() + 0.00;
    }
}
