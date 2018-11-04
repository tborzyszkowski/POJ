import java.util.Scanner;

public class PizzaStore {
	
	private PizzaFactory factory;
	private Client client;
	private Order order;
	
	Scanner scan = new Scanner(System.in);
	
	public PizzaStore(PizzaFactory factory, Client client, Order order) {
		this.factory = factory;
		this.client  = client;
		this.order   = order;
	}
	
	public void showMenu() {
		System.out.println("Menu: ");
		System.out.println(factory.createPizza(1, 0));
		System.out.println(factory.createPizza(2, 0));
		System.out.println(factory.createPizza(3, 0));
	}
	
	public void makeOrder() {
		int pizza_id;
		int pizza_size;
		boolean order_complete;
		
		if (client.isTakeAway()) order.setTakeaway();
		System.out.println();
		
		do {
			System.out.print("What would you like to order? Type pizzas id: ");
			while (!scan.hasNextInt()) {
				System.out.print("It has to be a number! Type pizzas id: ");
				scan.next();
			}
			pizza_id = scan.nextInt();
//			
			System.out.print("Which size (1. small, 2. medium, 3. big)? ");
			while (!scan.hasNextInt()) {
				System.out.print("It has to be a number! Type pizzas size: ");
				scan.next();
			}
			pizza_size = scan.nextInt();
			
			orderPizza(pizza_id, pizza_size);
			
			System.out.print("Do you want anything else (Y/N)? ");
			order_complete = (scan.next().toUpperCase().equals("Y")) ? false : true;
		} while (!order_complete);
		order.Checkout();
	}
	
	private void orderPizza(int id, int size) {
		Pizza pizza;
		pizza = factory.createPizza(id, size);
		order.addPizzaToCart(pizza);
	}
}
