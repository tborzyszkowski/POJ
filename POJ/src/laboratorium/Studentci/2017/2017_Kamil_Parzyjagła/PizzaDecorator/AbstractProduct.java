package PizzaDecorator;

public abstract class AbstractProduct {
    protected String description;
 
    public String getDescription() {
        return description;
    }
    
    public abstract double price();
 
    @Override
    public String toString() {
        return price() + "(" + getDescription() + ")";
    }
}