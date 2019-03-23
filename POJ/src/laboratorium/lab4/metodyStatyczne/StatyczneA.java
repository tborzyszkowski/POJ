package laboratorium.lab4.metodyStatyczne;

public class StatyczneA {
	static int x = 1;
	int y = 2;

	public StatyczneA(int y) {
		this.y = y;
	}
	
	static void wypisz() {
		System.out.println("static x= "+ x + "new.y = " + (new StatyczneA(15).y));
	}
	
	void cos() {
		System.out.println("static x = " +  x + " y = " + y);
	}
	
	static {
		x = 5 * x + 1;
	}

	@Override
	public String toString() {
		return "StatyczneA [y=" + y + " static x = " + x + "]";
	}
	
}
