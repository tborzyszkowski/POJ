package laboratorium.lab1.koszyk;

public class MugPromotion implements IPromotion{

	@Override
	public boolean CanCalculate(Koszyk cart) {
		double koszykBrutto = cart.sumaCenProduktów();
		if (koszykBrutto >= 200)
			return true;
		else
			return false;
	}

	@Override
	public void CalculateOffer(Koszyk cart) {
		if (this.CanCalculate(cart))
			cart.add(new Produkt("KKK", "Kubek promocyjny", 33));
		
	}

}
