package PizzaFactoryElements;

public class WarzywaBrak implements Warzywa{
	String name = "Brak warzywa";
	public Warzywa dajWarzywa(){
		System.out.println(name);
		return new WarzywaRozne();
	}
}
