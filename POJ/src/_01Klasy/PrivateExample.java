package _01Klasy;

class AAA{
	private int b = 2;
}

public class PrivateExample {
	private int a = 10;
	public void qqq(){
		AAA aa = new AAA();
		//System.out.println(aa.b);
	}
	public void ppp(){
		PrivateExample pe = new PrivateExample();
		System.out.println(pe.a);	
	}
	public static void main(String[] args) {
		PrivateExample pe = new PrivateExample();
		System.out.println(pe.a);
	}

}
