package protection.p1.p11;

public class Protection11 extends protection.p1.Protection {

	public Protection11() {
		System.out.println("konstruktor klasy dziedziczacej w innym pakiecie");

		// tylko dla klasy lub pakietu
//		System.out.println("n     = " + n);

		// dostepne tylko w klasie Protection
//		System.out.println("n_pri = " + n_pri);

		System.out.println("n_pro = " + n_pro);
		System.out.println("n_pub = " + n_pub);
	}
}
