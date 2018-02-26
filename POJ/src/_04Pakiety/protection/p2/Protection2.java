package _04Pakiety.protection.p2;

public class Protection2 extends _04Pakiety.protection.p1.Protection {

	public Protection2() {
		System.out.println("konstruktor klasy dziedziczacej w innym pakiecie");

		// tylko dla klasy lub pakietu

		// dostepne tylko w klasie Protection
//		System.out.println("n_pri = " + n_pri);
//		System.out.println("n_nic = " + n_nic);
		System.out.println("n_pro = " + n_pro);
		System.out.println("n_pub = " + n_pub);
	}
}
