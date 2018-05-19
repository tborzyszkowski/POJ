package PizzaFactoryElements;

public class CiastoCienkie implements Ciasto{
	String name = "Ciasto Cienkie";
	public Ciasto dajCiasto(){
		System.out.println("Dodaje: " + name);
		return new CiastoCienkie();
	}
}
