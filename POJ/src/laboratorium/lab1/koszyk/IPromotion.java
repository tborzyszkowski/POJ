package laboratorium.lab1.koszyk;

public interface IPromotion {
	boolean CanCalculate(Koszyk cart);
	void CalculateOffer(Koszyk cart);
}
