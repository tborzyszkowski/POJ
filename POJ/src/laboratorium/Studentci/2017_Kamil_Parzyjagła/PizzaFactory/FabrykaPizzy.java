package PizzaFactory;


public class FabrykaPizzy {
	
		public PizzaProdukcja wyslijPizze(String nazwa){
			PizzaProdukcja pizza = zrobPizze(nazwa);
			pizza.pakowanie();
			pizza.wysylanie();
			return pizza;
		}
		 
		protected PizzaProdukcja zrobPizze(String nazwa){
			PizzaProdukcja pizza = null;
			
			if(nazwa.equalsIgnoreCase("Capricciosa"))
			{
				System.out.println("");
				System.out.println("Capricciosa");
				System.out.println("");
				pizza =  new PizzaBasic(new FabrykaSkladnikowCapricciosa());
			}
			
			if(nazwa.equalsIgnoreCase("Margherita"))
			{
				System.out.println("");
				System.out.println("Margherita");
				System.out.println("");
				pizza =  new PizzaBasic(new FabrykaSkladnikowMargherita());
			}
			
			if(nazwa.equalsIgnoreCase("Hawaii"))
			{
				System.out.println("");
				System.out.println("Hawaii");
				System.out.println("");
				pizza =  new PizzaBasic(new FabrykaSkladnikowHawaii());
			}
			
			if(nazwa.equalsIgnoreCase("Vegetariana"))
			{
				System.out.println("");
				System.out.println("Vegetariana");
				System.out.println("");
				pizza =  new PizzaBasic(new FabrykaSkladnikowVegetariana());
			}
			
			if(nazwa.equalsIgnoreCase("Firenze"))
			{
				System.out.println("");
				System.out.println("Firenze");
				System.out.println("");
				pizza =  new PizzaBasic(new FabrykaSkladnikowFirenze());
			}
			
			return pizza;
		}
		
}
