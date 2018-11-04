
public class VeggiePizza extends Pizza {
	public VeggiePizza() {
		setId(2);
		setName("Veggie Pizza");
		addIngredient("Pepper");
		addIngredient("Tomato");
		addIngredient("Cheese");
		setPungency(0);
		setPrice(20, 25, 30);
	}
}
