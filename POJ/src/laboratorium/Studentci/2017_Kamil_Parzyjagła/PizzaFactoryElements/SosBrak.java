package PizzaFactoryElements;

public class SosBrak implements Sos{
	String name = "Brak sosu";
	public Sos dajSos(){
		System.out.println(name);
		return new SosBrak();
	}
}
