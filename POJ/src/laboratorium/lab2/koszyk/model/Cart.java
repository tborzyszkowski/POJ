package laboratorium.lab2.koszyk.model;

import java.util.ArrayList;

public class Cart {
	ArrayList<CartItem> items = new ArrayList<>();
	ArrayList<IPromotion> promotions = new ArrayList<>();
	
	public double totalPriceOfProducts(){
		double sum = 0;
		for(CartItem it : items)
			sum += it.getProduct().getPrice();
		return sum;
	}
	public double totalPriceOfDiscountedProducts(){
		double sum = 0;
		for(CartItem it : items)
			sum += it.getCurrentPrice();
		return sum;
	}
	public ArrayList<CartItem> getItems() {
		return items;
	}
	
	public Cart addProduct(Product p) {
		items.add(new CartItem(p));
		return this;
	}

	public Cart addPromotion(IPromotion p) {
		promotions.add(p);
		return this;
	}
	
}
