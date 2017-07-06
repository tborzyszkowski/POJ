package PizzaFactoryElements;

public class SerBrak implements Ser{
	String name = "Brak Sera";
	public Ser dajSer(){
		System.out.println(name);
		return new SerZolty();
	}
}
