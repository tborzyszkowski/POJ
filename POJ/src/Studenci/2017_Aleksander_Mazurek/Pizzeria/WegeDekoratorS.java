package Pizzeria;

public class WegeDekoratorS extends AbstractPizzaDekorator {
	public WegeDekoratorS(Pizza pizza) {
		super(pizza.getPizza());
		
		makeAsWegeS();
		
	}
	@Override
	public void MENU() {
		pizza.MENU();
	}
	private void makeAsWegeS() {
		pizza.setNumer(2);
		pizza.setNazwa("wegetarniańska średnia");
		pizza.setCena(25);
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

