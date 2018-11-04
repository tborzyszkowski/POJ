public class Program {

	public static void main(String[] args) {
		Client client = new Client();
		Order order = new Order();
		PizzaFactory factory = new PizzaFactory();
		PizzaStore store = new PizzaStore(factory, client, order);
		
		store.showMenu();
		store.makeOrder();
	}
}
