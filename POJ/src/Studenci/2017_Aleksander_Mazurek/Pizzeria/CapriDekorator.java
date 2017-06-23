package Pizzeria;

public class CapriDekorator extends AbstractPizzaDekorator {
	

		public CapriDekorator(Pizza pizza) {
			super(pizza.getPizza());
			makeAsCapriM();
		
		}
		@Override
		public void MENU() {
		pizza.MENU();
			
		}
		private void makeAsCapriM() {
			pizza.setNumer(4);
			pizza.setNazwa("capricciosa mała");
			pizza.setCena(22);
			pizza.setRozmiar("mała");
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

