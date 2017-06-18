package Pizzeria;

public class PepeDekorator extends AbstractPizzaDekorator {
	

		public PepeDekorator(Pizza pizza) {
			super(pizza.getPizza());
			makeAsPepeM();
		
		}
		@Override
		public void MENU() {
			pizza.MENU();
			
		}
		private void makeAsPepeM() {
			pizza.setNumer(7);
			pizza.setNazwa("peperoni mała");
			pizza.setCena(25);
			pizza.setRozmiar("mała");
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