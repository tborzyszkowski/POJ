package Pizzeria;

public class WegeDekoratorD extends AbstractPizzaDekorator {
	public WegeDekoratorD(Pizza pizza) {
		super(pizza.getPizza());
		
		makeAsWegeD();
		
	}
	@Override
	public void MENU() {
		pizza.MENU();
	}
	private void makeAsWegeD() {
		pizza.setNumer(3);
		pizza.setNazwa("wegetarniańska duża");
		pizza.setCena(35);
		pizza.setRozmiar("średnia");
		pizza.setOstrosc(0);
		pizza.setPapryka(true);
		pizza.setPomidor(true);
		pizza.setSer(true);
		pizza.setPieczarki(false);
		pizza.setSos(false);
		pizza.setSzynka(false);
		pizza.setSalami(false);
		pizza.setPapryka_ostra(false);
		pizza.setCebula(false);
	
	}

}
