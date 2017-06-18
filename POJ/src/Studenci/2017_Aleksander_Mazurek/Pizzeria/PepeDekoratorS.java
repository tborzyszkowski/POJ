package Pizzeria;

public class PepeDekoratorS extends AbstractPizzaDekorator {
	

		public PepeDekoratorS(Pizza pizza) {
			super(pizza.getPizza());
			makeAsPepeS();
		
		}
		@Override
		public void MENU() {
			pizza.MENU();
			
		}
		private void makeAsPepeS() {
			pizza.setNumer(8);
			pizza.setNazwa("peperoni średnia");
			pizza.setCena(30);
			pizza.setRozmiar("średnia");
			pizza.setOstrosc(5);
			pizza.setPapryka(false);
			pizza.setPomidor(false);
			pizza.setSer(true);
			pizza.setPieczarki(true);
			pizza.setSos(true);
			pizza.setSzynka(false);
			pizza.setSalami(true);
			pizza.setPapryka_ostra(true);
			pizza.setCebula(true);
			
		}
		

	}