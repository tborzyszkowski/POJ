package PizzaDecoratorElements;

import PizzaDecorator.AbstractProduct;
import PizzaDecorator.AbstractProductDecorator;


public class CiastoCienkieDekorator extends AbstractProductDecorator{
	public CiastoCienkieDekorator(AbstractProduct product) {
        super(product);
    }

    @Override
    public String getDescription() {
        return product.getDescription() + ", ciasto cienkie";
    }

    @Override
    public double price() {
        return product.price() + 3.55;
    }
}
