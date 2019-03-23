package _02Interfejsy.commonName;

public class Main {

	public static void main(String[] args) {
		IPilkarz p;
		IZolnierz z; 
		Zawodnik zaw = new Zawodnik();
		
		zaw.strzelaj();
		
		p = zaw;
		p.strzelaj();
		
		z = zaw;
		z.strzelaj();
		
		((IPilkarz) zaw).strzelaj();

	}

}
