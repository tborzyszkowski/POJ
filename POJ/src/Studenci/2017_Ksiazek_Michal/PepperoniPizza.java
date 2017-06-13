
public class PepperoniPizza extends Pizza {
	public PepperoniPizza() {
		setId(1);
		setName("Pepperoni Pizza");
		addIngredient("Salami");
		addIngredient("Spicy pepper");
		addIngredient("Onion");
		addIngredient("Cheese");
		setPungency(5);
		setPrice(25, 30, 35);
	}
}
