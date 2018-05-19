package PizzaFactory;
import PizzaFactoryElements.Ciasto;
import PizzaFactoryElements.Mieso;
import PizzaFactoryElements.Ser;
import PizzaFactoryElements.Sos;
import PizzaFactoryElements.Warzywa;


interface FabrykaSkladnikowPizzy {
	public Ciasto tworzCiasto();
	public Ser tworzSer();
	public Sos tworzSos();
	public Warzywa tworzWarzywa();
	public Mieso tworzMieso();
}
