package PizzaFactory;


public class PizzaBasic extends PizzaProdukcja{
FabrykaSkladnikowPizzy fabrykaSkladnikowPizzy;
	
	public PizzaBasic(FabrykaSkladnikowPizzy q){
		this.fabrykaSkladnikowPizzy = q;
		tworzenie();
	}
	
	public void tworzenie(){
		ciasto = fabrykaSkladnikowPizzy.tworzCiasto().dajCiasto();
		ser = fabrykaSkladnikowPizzy.tworzSer().dajSer();
		sos = fabrykaSkladnikowPizzy.tworzSos().dajSos();
		warzywa = fabrykaSkladnikowPizzy.tworzWarzywa().dajWarzywa();
		mieso = fabrykaSkladnikowPizzy.tworzMieso().dajMieso();		
		
	}
}

