package PizzaDecoratorElements;

import PizzaDecorator.AbstractProduct;
import PizzaDecorator.AbstractProductDecorator;


public class SosBrakDekorator extends AbstractProductDecorator{
	public SosBrakDekorator(AbstractProduct product) {
        super(product);
    }

    @Override
    public String getDescription() {
        return product.getDescription() + ", brak sosu";
    }

    @Override
    public double price() {
        return product.price() + 0.00;
    }
}
