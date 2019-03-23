package _02Interfejsy.commonName;

public class Zawodnik implements IPilkarz, IZolnierz {

	@Override
	public void strzelaj() {
		if( this instanceof IPilkarz) {
			System.out.println("Piłkarz");
		}
		if( this instanceof IZolnierz) {
			System.out.println("Żołnierz");
		}

	}

}
