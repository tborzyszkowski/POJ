package _02Interfejsy.commonName;

public class Zawodnik implements Pilkarz, Zolnierz {

	@Override
	public void strzelaj() {
		if( this instanceof Pilkarz) {
			System.out.println("Piłkarz");
		}
		if( this instanceof Zolnierz) {
			System.out.println("Żołnierz");
		}

	}

}
