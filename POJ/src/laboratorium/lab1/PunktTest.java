package laboratorium.lab1;

public class PunktTest {

	public static void main(String[] args) {
		Punkt p1 = new Punkt(3, 4);
		Punkt p2 = new Punkt();
		System.out.println("p1 = " + p1);
		System.out.println("p2 = " + p2);
		System.out.println(p1.odleglosc(p2));
	}
}
