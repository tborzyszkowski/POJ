package _02Interfejsy.deepcopy;

public class TestDolly {

	public static void main(String[] args) throws Exception{
		Dolly d = new Dolly();
		Dolly d2 = d.clone();
		System.out.println("D: " + d);
		System.out.println("D2: "+ d2);
		d.getE().setI(123);
		d.setW(321);
		System.out.println("D: " + d);
		System.out.println("D2: "+ d2);
	}
}
