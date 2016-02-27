package laboratorium.lab1;

public class OdcinekTest {

	public static void main(String[] args) {
		Odcinek o = new Odcinek(new Punkt(1,2),new Punkt(3,4));
		
		System.out.println(o);
		System.out.println(o.dlugosc());
		System.out.println(""+ o.getA() + o.getB());
		o.getA().setX(8);
		o.setOdcinek(o.getB(), o.getA());
		System.out.println(o);
		System.out.println(o.dlugosc());
		
		Punkt p = new Punkt(1,1);
		System.out.println(o.odlegloscPunktu(p));
	}

}
