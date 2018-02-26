package _03Dziedziczenie;

class X{}
class Z extends X{}

public class Typy {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		X x = new X();
		Z z = new Z();
		
		System.out.println(x.getClass().equals(z.getClass()));
	}

}
