package PizzaFactory;
import PizzaFactoryElements.Ciasto;
import PizzaFactoryElements.CiastoGrube;
import PizzaFactoryElements.Mieso;
import PizzaFactoryElements.MiesoKebab;
import PizzaFactoryElements.Ser;
import PizzaFactoryElements.SerBrak;
import PizzaFactoryElements.Sos;
import PizzaFactoryElements.SosKetchup;
import PizzaFactoryElements.Warzywa;
import PizzaFactoryElements.WarzywaRozne;


public class FabrykaSkladnikowFirenze implements FabrykaSkladnikowPizzy{
	public Ciasto tworzCiasto(){
		return new CiastoGrube();
	}
	
	public Ser tworzSer(){
		return new SerBrak();
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
