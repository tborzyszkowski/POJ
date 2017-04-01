package koszykPodstawowy.model;

import java.util.ArrayList;

public class Cart {
	ArrayList<CartItem> items = new ArrayList<>();
	
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
	
}
