package protection.p1;

public class Protection {
    private   int n_pri = 2;
    int n_nic = 1; // "nic"
    protected int n_pro = 3;
    public    int n_pub = 4;

    public Protection() {
    	System.out.println("konstruktor bazowy");
    	System.out.println("n_pri = " + n_pri);
    	System.out.println("n_nic = " + n_nic);
    	System.out.println("n_pro = " + n_pro);
    	System.out.println("n_pub = " + n_pub);
    }
}
