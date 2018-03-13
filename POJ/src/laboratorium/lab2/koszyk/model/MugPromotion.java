package laboratorium.lab2.koszyk.model;

public class MugPromotion implements IPromotion{

	@Override
	public boolean CanCalculate(Cart cart) {
		double koszykBrutto = cart.totalPriceOfProducts();
		if (koszykBrutto >= 200)
			return true;
		else
			return false;
	}

	@Override
	public void CalculateOffer(Cart cart) {
		if (this.CanCalculate(cart))
			cart.addProduct(new Product("Kubek promocyjny", 0.01));
		
	}

}
