package Pizzeria;

public class CapriDekoratorS extends AbstractPizzaDekorator {
	

		public CapriDekoratorS(Pizza pizza) {
			super(pizza.getPizza());
			makeAsCapriM();
		
		}
		@Override
		public void MENU() {
			pizza.MENU();
			
		}
		private void makeAsCapriM() {
			pizza.setNumer(5);
			pizza.setNazwa("capricciosa średnia");
			pizza.setCena(27);
			pizza.setRozmiar("średnia");
			pizza.setOstrosc(1);
			pizza.setPapryka(false);
			pizza.setPomidor(false);
			pizza.setSer(false);
			pizza.setPieczarki(true);
			pizza.setSos(true);
			pizza.setSzynka(true);
			pizza.setSalami(false);
			pizza.setPapryka_ostra(false);
			pizza.setCebula(false);
			
		}
		

	}