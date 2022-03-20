package _01Klasy;

class CallBy {
	int a, b;
	CallBy(int i, int j) {
		a = i;
		b = j;
	}
	void byValue(int i, int j) {
		i *= 2;
		j /= 2;
		System.out.println("Wewn: i = " + i + " j = " + j );
	}
	void byInteger(Integer i, Integer j) {
		i *= 2;
		j /= 2;
		System.out.println("Wewn: i = " + i + " j = " + j );
	}
	void byRef(CallBy o) {
		o.a *= 2;
		o.b /= 2;
		System.out.println("Wewn: a = " + o.a + " b = " + o.b );
	}
}

public class CallByDemo {
	public static void main(String[] args) {
		CallBy ob = new CallBy(15, 20);
		int i = 5;
		int j = 10;

		System.out.println("Zewn:  i = " + i + " j = " + j);
		ob.byValue(i, j);
		System.out.println("Zewn:  i = " + i + " j = " + j );

		System.out.println("Zewn: a = " + ob.a + " b = " + ob.b);
		ob.byRef(ob);
		System.out.println("Zewn: a = " + ob.a + " b = " + ob.b );
		
		System.out.println("Zewn: i = " + i + " j = " + j);
		Integer ii = new Integer(i);
		Integer jj = new Integer(j);
		ob.byInteger(ii, jj);
		System.out.println("Zewn: i = " + i + " j = " + j );
		System.out.println("Zewn: ii= " + ii+ " jj= " + jj);
	}
}
