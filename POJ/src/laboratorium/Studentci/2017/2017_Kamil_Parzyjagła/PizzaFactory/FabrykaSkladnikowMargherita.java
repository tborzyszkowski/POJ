package PizzaFactory;
import PizzaFactoryElements.Ciasto;
import PizzaFactoryElements.CiastoCienkie;
import PizzaFactoryElements.Mieso;
import PizzaFactoryElements.MiesoKebab;
import PizzaFactoryElements.Ser;
import PizzaFactoryElements.SerZolty;
import PizzaFactoryElements.Sos;
import PizzaFactoryElements.SosKetchup;
import PizzaFactoryElements.Warzywa;
import PizzaFactoryElements.WarzywaRozne;


public class FabrykaSkladnikowMargherita implements FabrykaSkladnikowPizzy{
	public Ciasto tworzCiasto(){
		return new CiastoCienkie();
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
		return new MiesoKebab();
	}
}
