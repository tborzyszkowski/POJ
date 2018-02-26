package _04Pakiety.protection.p1;

class Derived extends Protection {

    Derived() {
    	System.out.println("konstruktor klasy dziedziczacej");

    	// dostepne tylko w klasie Protection
//    	System.out.println("n_pri = " + n_pri);
    	System.out.println("n_nic = " + n_nic);
    	System.out.println("n_pro = " + n_pro);
    	System.out.println("n_pub = " + n_pub);
    }
}
