package PizzaDecoratorElements;

import PizzaDecorator.AbstractProduct;
import PizzaDecorator.AbstractProductDecorator;


public class MiesoKebabDekorator extends AbstractProductDecorator{
	public MiesoKebabDekorator(AbstractProduct product) {
        super(product);
    }

    @Override
    public String getDescription() {
        return product.getDescription() + ", mieso kebab";
    }

    @Override
    public double price() {
        return product.price() + 7.25;
    }
}
