package PizzaDecorator;
public abstract class AbstractProductDecorator extends AbstractProduct {
    protected AbstractProduct product;
 
    public AbstractProductDecorator(AbstractProduct product) {
        this.product = product;
    }
    
    @Override
    public abstract String getDescription();
}