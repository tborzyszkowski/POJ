package _02Interfejsy.commonName;

public class Main {

	public static void main(String[] args) {
		Pilkarz p;
		Zolnierz z; 
		Zawodnik zaw = new Zawodnik();
		
		zaw.strzelaj();
		
		p = zaw;
		p.strzelaj();
		
		z = zaw;
		z.strzelaj();
		
		((Pilkarz) zaw).strzelaj();

	}

}
