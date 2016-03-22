package laboratorium.lab1.koszyk;

public class ValuePromotion implements IPromotion{

	@Override
	public boolean CanCalculate(Koszyk cart) {
		double koszykBrutto = cart.sumaCenProduktów();
		if (koszykBrutto >= 300)
			return true;
		else
			return false;
	}

	@Override
	public void CalculateOffer(Koszyk cart) {
		if (this.CanCalculate(cart))
			cart.sumaPromocyjnaKoszyka *= 0.95;
	}

}
