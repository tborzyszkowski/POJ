package PizzaFactoryElements;

public class MiesoBrak implements Mieso{
	String name = "Brak miesa";
	public Mieso dajMieso(){
		System.out.println(name);
		return new MiesoKebab();
	}
}
