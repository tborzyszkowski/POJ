package laboratorium.lab5.model.observators;

public class Lights extends Device {

	@Override
	public void turnOn() {
		System.out.println("Włączam światła");

	}

	@Override
	public void turnOff() {
		System.out.println("Światła zostały wyłączone");

	}

}
