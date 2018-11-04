package PizzaFactory;
import PizzaFactoryElements.Ciasto;
import PizzaFactoryElements.Mieso;
import PizzaFactoryElements.Ser;
import PizzaFactoryElements.Sos;
import PizzaFactoryElements.Warzywa;


public abstract class PizzaProdukcja {
	Ciasto ciasto;
	Ser ser;
	Sos sos;
	Warzywa warzywa;
	Mieso mieso;
	
	public abstract void tworzenie();
	
	public void pakowanie(){
		System.out.println("Pakuje pizze...");
	}
	
	public void wysylanie(){
		System.out.println("Wysylam pizze...");
	}
}
