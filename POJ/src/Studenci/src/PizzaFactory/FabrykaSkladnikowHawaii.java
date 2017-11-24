package PizzaFactory;
import PizzaFactoryElements.Ciasto;
import PizzaFactoryElements.CiastoCienkie;
import PizzaFactoryElements.Mieso;
import PizzaFactoryElements.MiesoSzynka;
import PizzaFactoryElements.Ser;
import PizzaFactoryElements.SerZolty;
import PizzaFactoryElements.Sos;
import PizzaFactoryElements.SosKetchup;
import PizzaFactoryElements.Warzywa;
import PizzaFactoryElements.WarzywaBrak;


public class FabrykaSkladnikowHawaii implements FabrykaSkladnikowPizzy{
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
		return new WarzywaBrak();
	}
	
	public Mieso tworzMieso(){
		return new MiesoSzynka();
	}
}
