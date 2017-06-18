package Pizzeria;

public class CapriDekoratorD extends AbstractPizzaDekorator {
	

		public CapriDekoratorD(Pizza pizza) {
			super(pizza.getPizza());
			makeAsCapriD();
		
		}
		@Override
		public void MENU() {
			pizza.MENU();
			
		}
		private void makeAsCapriD() {
			pizza.setNumer(6);
			pizza.setNazwa("capricciosa duża");
			pizza.setCena(32);
			pizza.setRozmiar("duża");
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