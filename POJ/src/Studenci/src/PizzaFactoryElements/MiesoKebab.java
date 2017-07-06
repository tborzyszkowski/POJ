package PizzaFactoryElements;

public class MiesoKebab implements Mieso{
	String name = "Mieso Kebab";
	public Mieso dajMieso(){
		System.out.println("Dodaje: " + name);
		return new MiesoKebab();
	}
}
