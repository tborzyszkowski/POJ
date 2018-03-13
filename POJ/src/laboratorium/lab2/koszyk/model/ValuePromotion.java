package laboratorium.lab2.koszyk.model;

public class ValuePromotion implements IPromotion{

	@Override
	public boolean CanCalculate(Cart cart) {
		double koszykBrutto = cart.totalPriceOfProducts();
		if (koszykBrutto >= 300)
			return true;
		else
			return false;
	}

	@Override
	public void CalculateOffer(Cart cart) {
		if (this.CanCalculate(cart))
			cart.promotionSumOfProducts *= 0.95;
	}

}
