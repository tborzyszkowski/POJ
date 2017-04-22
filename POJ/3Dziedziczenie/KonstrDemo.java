// Demonstracja kolejnosci wywolania konstruktorow
class AK {
    AK(int i) {
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
    BK(int i) {
    	super(i+1);
    	System.out.println("Konstruktor z B " + i);
    }
    BK(){//super();
    	}
    }
class CK extends BK {
    CK(int i) {
    	//super();
    	super(2 * i);	
    	System.out.println("Konstruktor z C " + i);
    }
}
// klasa testujaca
class KonstrDemo {
    public static void main (String args[]) {
    	new CK(5);
    }
}
