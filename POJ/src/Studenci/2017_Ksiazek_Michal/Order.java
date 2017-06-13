import java.util.ArrayList;
import java.util.List;

public class Order {
	
	private List<Pizza> orderList = new ArrayList<>();
	private double totalCost = 0;
	private boolean takeaway = false;
	
	public void setTakeaway() {
		takeaway = true;
	}
	
	public void addPizzaToCart(Pizza pizza) {
		orderList.add(pizza);
		totalCost += pizza.getPrice();
	}
	
	public void Checkout() {
		System.out.println();
		System.out.println("Your order:");
		for (Pizza pizza : orderList) {
			System.out.println(pizza.getName() + ", " + pizza.getSize() + ", " + pizza.getPrice() + " PLN");
		}
		if (takeaway) {
			System.out.println("+ cost of delivery 10 PLN");
			totalCost += 10;
		}
		System.out.println("Total cost: " + totalCost + " PLN");
	}
}
