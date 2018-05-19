package PizzaFactory;
import PizzaFactoryElements.Ciasto;
import PizzaFactoryElements.CiastoCienkie;
import PizzaFactoryElements.Mieso;
import PizzaFactoryElements.MiesoBrak;
import PizzaFactoryElements.Ser;
import PizzaFactoryElements.SerBrak;
import PizzaFactoryElements.Sos;
import PizzaFactoryElements.SosBrak;
import PizzaFactoryElements.Warzywa;
import PizzaFactoryElements.WarzywaBrak;


public class FabrykaSkladnikowCapricciosa implements FabrykaSkladnikowPizzy {
	public Ciasto tworzCiasto(){
		return new CiastoCienkie();
	}
	
	public Ser tworzSer(){
		return new SerBrak();
	}
	
	public Sos tworzSos(){
		return new SosBrak();
	}
	
	public Warzywa tworzWarzywa(){
		return new WarzywaBrak();
	}
	
	public Mieso tworzMieso(){
		return new MiesoBrak();
	}
}
