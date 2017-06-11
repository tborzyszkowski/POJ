package PizzaDecoratorElements;

import PizzaDecorator.AbstractProduct;
import PizzaDecorator.AbstractProductDecorator;


public class WarzywaMixDekorator extends AbstractProductDecorator{
	public WarzywaMixDekorator(AbstractProduct product) {
        super(product);
    }

    @Override
    public String getDescription() {
        return product.getDescription() + ", warzywa mix";
    }

    @Override
    public double price() {
        return product.price() + 3.55;
    } 
}
