package _03Dziedziczenie;

class AK {
    AK(int i) { // <- 11
    	//super();
    	int j=5;
    	//super();
    	System.out.println("Konstruktor z A " + i);
    }
    AK(){
    	//super();
    	System.out.println("Konstruktor z A()");
    }
}
class BK extends AK {
    BK(int i) { // <- 10
    	super(i+1); // <- 11
    	System.out.println("Konstruktor z B " + i);
    }
    BK(){//super();
    	}
    }
class CK extends BK {
    CK(int i) { // <- 5
    	//super();
    	super(2 * i); // <- 10
    	System.out.println("Konstruktor z C " + i);
    }
}
 
class KonstrDemo {
    public static void main (String args[]) {
    	new CK(5);
    }
}
