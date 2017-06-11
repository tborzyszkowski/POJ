package PizzaFactoryElements;

public class SerZolty implements Ser{
	String name = "Ser Zolty";
	public Ser dajSer(){
		System.out.println("Dodaje: " + name);
		return new SerZolty();
	}
}
