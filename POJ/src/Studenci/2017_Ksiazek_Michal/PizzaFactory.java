public class PizzaFactory {
	
	public Pizza createPizza(int id, int size) {
		Pizza pizza = null;
		
		switch (id) {
		case 1:
			pizza = new PepperoniPizza();
			break;
		case 2:
			pizza = new VeggiePizza();
			break;
		case 3:
			pizza = new CapricciosaPizza();
			break;
		}
		
		pizza.setSize(size);
		return pizza;
	}
}
