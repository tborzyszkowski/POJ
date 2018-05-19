package PizzaFactoryElements;

public class CiastoGrube implements Ciasto{
	String name = "Ciasto Grube";
	public Ciasto dajCiasto(){
		System.out.println("Dodaje: " + name);
		return new CiastoCienkie();
	}
}
