package Main;
import java.util.ArrayList;
import java.util.List;

import PizzaDecorator.AbstractProduct;
import PizzaFactory.FabrykaPizzy;
import PizzaFactory.PizzaProdukcja;

public class MenuProdukcji {
	
	void ProdukujZamownienie(int[] iloscZamowien){
		    if(iloscZamowien[0]>0){
		    	FabrykaPizzy fabrykapizzy = new FabrykaPizzy();
				PizzaProdukcja pizza = fabrykapizzy.wyslijPizze("Capricciosa");
		    }
		    
		    if(iloscZamowien[1]>0){
		    	FabrykaPizzy fabrykapizzy = new FabrykaPizzy();
				PizzaProdukcja pizza = fabrykapizzy.wyslijPizze("Margherita");
		    }
		    
		    if(iloscZamowien[2]>0){
		    	FabrykaPizzy fabrykapizzy = new FabrykaPizzy();
				PizzaProdukcja pizza = fabrykapizzy.wyslijPizze("Hawaii");
		    }
		    
		    if(iloscZamowien[3]>0){
		    	FabrykaPizzy fabrykapizzy = new FabrykaPizzy();
				PizzaProdukcja pizza = fabrykapizzy.wyslijPizze("Vegetariana");
		    }
		    
		    if(iloscZamowien[4]>0){
		    	FabrykaPizzy fabrykapizzy = new FabrykaPizzy();
				PizzaProdukcja pizza = fabrykapizzy.wyslijPizze("Firenze");
		    }
	}
}
