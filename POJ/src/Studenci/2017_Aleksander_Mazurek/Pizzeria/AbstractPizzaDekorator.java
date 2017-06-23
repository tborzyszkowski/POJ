package Pizzeria;

public abstract class AbstractPizzaDekorator implements Kreator {
	
	protected Pizza pizza;
	public AbstractPizzaDekorator(Pizza pizza){
		this.pizza= pizza;
	}
	@Override
	public Pizza getPizza(){
		return pizza;
		
	}
}
