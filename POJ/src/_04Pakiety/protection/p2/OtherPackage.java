package _04Pakiety.protection.p2;

class OtherPackage {

	public OtherPackage() {
		_04Pakiety.protection.p1.Protection p = new _04Pakiety.protection.p1.Protection();

		System.out.println("konstruktor innego pakietu");

//		System.out.println("n_pri = " + p.n_pri);
//		System.out.println("n_nic = " + p.n_nic);
//		System.out.println("n_pro = " + p.n_pro);
		System.out.println("n_pub = " + p.n_pub);
	}
}
