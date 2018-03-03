package laboratorium.lab1;

public class OdcinekTest {

	public static void main(String[] args) {
		Odcinek o = new Odcinek(new Punkt(0,2),new Punkt(2,0));
		Punkt p = new Punkt(1,1);
		
		System.out.println(o);
		System.out.println(p);
		System.out.println(o.odlegloscPunktu(p));
		
		o.getA().setY(5);
		o.getB().setX(5);
		System.out.println(o);
		System.out.println(o.odlegloscPunktu(p));
		
		
	}

}
