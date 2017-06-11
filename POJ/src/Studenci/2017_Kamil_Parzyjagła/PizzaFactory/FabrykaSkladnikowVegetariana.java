package PizzaFactory;
import PizzaFactoryElements.Ciasto;
import PizzaFactoryElements.CiastoGrube;
import PizzaFactoryElements.Mieso;
import PizzaFactoryElements.MiesoBrak;
import PizzaFactoryElements.Ser;
import PizzaFactoryElements.SerZolty;
import PizzaFactoryElements.Sos;
import PizzaFactoryElements.SosKetchup;
import PizzaFactoryElements.Warzywa;
import PizzaFactoryElements.WarzywaRozne;


public class FabrykaSkladnikowVegetariana implements FabrykaSkladnikowPizzy{
	public Ciasto tworzCiasto(){
		return new CiastoGrube();
	}
	
	public Ser tworzSer(){
		return new SerZolty();
	}
	
	public Sos tworzSos(){
		return new SosKetchup();
	}
	
	public Warzywa tworzWarzywa(){
		return new WarzywaRozne();
	}
	
	public Mieso tworzMieso(){
		return new MiesoBrak();
	}
}
