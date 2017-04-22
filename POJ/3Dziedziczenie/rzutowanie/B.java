package rzutowanie;

public class B extends A {
	int i;
	int k;
	
	B(int i, int ai, int j, int k){
		super(ai, j);
		this.i = i;
		this.k = k;
	}
	
	@Override
	public String toString() {
		return "B [i=" + i + ", super.i=" + super.i+ ", k=" + k + ", j=" + j + "]";
	}

	String metoda1(){
		return "B.metoda1()";
	}
	String metoda3(){
		return "B.metoda3()";
	}
}
