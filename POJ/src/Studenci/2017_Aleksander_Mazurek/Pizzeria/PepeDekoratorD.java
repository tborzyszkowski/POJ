package Pizzeria;

public class PepeDekoratorD extends AbstractPizzaDekorator {
	

		public PepeDekoratorD(Pizza pizza) {
			super(pizza.getPizza());
			makeAsPepeD();
		
		}
		@Override
		public void MENU() {
			pizza.MENU();
		}
		private void makeAsPepeD() {
			pizza.setNumer(9);
			pizza.setNazwa("peperoni duża");
			pizza.setCena(35);
			pizza.setRozmiar("duża");
			pizza.setOstrosc(5);
			pizza.setPapryka(false);
			pizza.setPomidor(false);
			pizza.setSer(true);
			pizza.setPieczarki(true);
			pizza.setSos(true);
			pizza.setSzynka(false);
			pizza.setSalami(true);
			pizza.setPapryka_ostra(true);
		
		}
		

	}