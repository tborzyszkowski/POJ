package Pizzeria;

public class WegeDekorator extends AbstractPizzaDekorator {

	public WegeDekorator(Pizza pizza) {
		super(pizza.getPizza());
		makeAsWegeM();
	
	}
	@Override
	public void MENU() {
	pizza.MENU();
		
	}
	private void makeAsWegeM() {
		pizza.setNumer(1);
		pizza.setNazwa("wegetarniańska mała");
		pizza.setCena(20);
		pizza.setRozmiar("mała");
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
