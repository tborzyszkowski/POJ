package laboratorium.lab2.koszyk;

import java.util.ArrayList;
import laboratorium.lab2.koszyk.model.*;

public class Main {
	public static ArrayList<Product> getSampleProducts(int n) {
		ArrayList<Product> sample = new ArrayList<>();
		for (int i = 1; i <= n; i++) {
			Product p = new Product("Product " + i, i * 25);
			sample.add(p);
		}
		return sample;
	}

	public static Cart getSampleCart() {
		Cart c = new Cart();
		for (Product p : getSampleProducts(10)) {
			c.addProduct(p);
		}
		return c;
	}

	public static void main(String[] args) {
		// System.out.println(getSampleCart().getItems());
		Cart cart = new Cart();
		cart.addProduct(new Product("Kartofle", 10))
		    .addProduct(new Product("Gazeta", 3))
		    .applyPromotions();
	}
}
