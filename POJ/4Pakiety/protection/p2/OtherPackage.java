package protection.p2;

class OtherPackage {

	public OtherPackage() {
		protection.p1.Protection p = new protection.p1.Protection();

		System.out.println("konstruktor innego pakietu");

		// tylko dla klasy lub pakietu

		// tylko dla klasy
//		System.out.println("n_pri = " + p.n_pri);
//		System.out.println("n_nic = " + p.n_nic);
		// tylko dla klasy, klasy pochodnej lub pakietu
//		System.out.println("n_pro = " + p.n_pro);
		System.out.println("n_pub = " + p.n_pub);
	}
}
