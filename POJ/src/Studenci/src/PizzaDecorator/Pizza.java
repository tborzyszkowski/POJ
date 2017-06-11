package PizzaDecorator;

public class Pizza extends AbstractProduct {
	
    public Pizza() {
        description = "Pizza";
    }
 
    @Override
    public double price() {
        return 15.00;
    }
    
}