package laboratorium.lab2.koszyk;

import laboratorium.lab2.koszyk.model.*;

public class Main {

	public static void main(String[] args) {

		Cart cart = new Cart();
		cart.addProduct(new Product("Kartofle", 200))
		    .addProduct(new Product("Gazeta", 100))
		    .addPromotion(new ValuePromotion())
		    .addPromotion(new MugPromotion())
		    .addPromotion(new MugPromotion())
		    .applyPromotions();

		System.out.println(cart);
//
//		cart.addPromotion(new MugPromotion())
//		    .applyPromotions();
//
//		System.out.println(cart);
	}
}
