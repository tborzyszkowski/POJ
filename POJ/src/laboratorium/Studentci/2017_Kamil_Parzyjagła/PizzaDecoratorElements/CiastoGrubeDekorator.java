package PizzaDecoratorElements;

import PizzaDecorator.AbstractProduct;
import PizzaDecorator.AbstractProductDecorator;


public class CiastoGrubeDekorator extends AbstractProductDecorator{
	public CiastoGrubeDekorator(AbstractProduct product) {
        super(product);
    }

    @Override
    public String getDescription() {
        return product.getDescription() + ", ciasto grube";
    }

    @Override
    public double price() {
        return product.price() + 5.25;
    }
}
