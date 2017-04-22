package rzutowanie;

public class A {
	int i;
	int j;
	
	A(int i, int j){
		this.i = i;
		this.j = j;
	}
	
	String metoda1(){
		return "A.metoda1()";
	}
	String metoda2(){
		return "A.metoda2()";
	}

	@Override
	public String toString() {
		return "A [i=" + i + ", j=" + j + "]";
	}
	
}
