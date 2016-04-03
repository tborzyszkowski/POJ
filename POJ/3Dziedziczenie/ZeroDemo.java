class Zero {
	int i = 5;
}

class AZ extends Zero {
	int i = 9;
	int getSuperI(){return super.i;}
	void setSuperI(int v){super.i = v;}
}

class BZ extends AZ {
	int i = 7;

	BZ() {
		System.out.println("super.i = " + super.i + " i = " + i);
		super.i = 6;
		setSuperI(1);
		System.out.println("super.i = " + super.i + " i = " + i+ getSuperI());
	}
}

public class ZeroDemo {

	public static void main(String[] args) {
		new BZ();

	}

}
