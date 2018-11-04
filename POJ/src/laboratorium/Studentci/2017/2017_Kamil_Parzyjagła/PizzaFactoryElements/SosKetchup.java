package PizzaFactoryElements;

public class SosKetchup implements Sos{
	String name = "Sos Ketchup";
	public Sos dajSos(){
		System.out.println("Dodaje: " + name);
		return new SosKetchup();
	}
}
