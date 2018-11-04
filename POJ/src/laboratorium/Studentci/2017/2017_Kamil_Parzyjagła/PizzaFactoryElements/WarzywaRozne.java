package PizzaFactoryElements;

public class WarzywaRozne implements Warzywa{
	String name = "Warzywa Rozne";
	public Warzywa dajWarzywa(){
		System.out.println("Dodaje: " + name);
		return new WarzywaRozne();
	}
}
