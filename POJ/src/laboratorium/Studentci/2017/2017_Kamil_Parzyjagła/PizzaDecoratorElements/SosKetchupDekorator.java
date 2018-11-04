package PizzaDecoratorElements;

import PizzaDecorator.AbstractProduct;
import PizzaDecorator.AbstractProductDecorator;


public class SosKetchupDekorator extends AbstractProductDecorator{
	public SosKetchupDekorator(AbstractProduct product) {
        super(product);
    }

    @Override
    public String getDescription() {
        return product.getDescription() + ", ketchup";
    }

    @Override
    public double price() {
        return product.price() + 0.55;
    } 
}
