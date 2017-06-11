package PizzaFactoryElements;

public class MiesoSzynka implements Mieso{
	String name = "Mieso szynka";
	public Mieso dajMieso(){
		System.out.println("Dodaje: " + name);
		return new MiesoKebab();
	}
}
