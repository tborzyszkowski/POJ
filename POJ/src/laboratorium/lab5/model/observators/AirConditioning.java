package laboratorium.lab5.model.observators;

public class AirConditioning extends Device{
	
	@Override
	public void turnOn() {
		System.out.println("Klimatyzacja pomieszczeń została uruchomiona");
		
	}

	@Override
	public void turnOff() {
		System.out.println("Klimatyzacja pomieszczeń zakończyła pracę");
		
	}

}
