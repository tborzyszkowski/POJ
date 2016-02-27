package laboratorium.lab1;

public class Odcinek {
	private Punkt a;
	private	Punkt b;
	
	Odcinek(Punkt a1, Punkt b1){
		a = a1;
		b = b1;
	}
	void setOdcinek(Punkt x, Punkt y){
		a = x;
		b = y;
	}
	Punkt getA(){
		return a;
	}
	Punkt getB(){
		return b;
	}
	public String toString(){
		return "["+a+", "+b+"]";
	}
	public double dlugosc(){
		return Math.sqrt(((a.getX()-b.getX())*(a.getX()-b.getX()) + 
				(a.getY()-b.getY())*(a.getY()-b.getY())));
	}
	public double odlegloscPunktu(Punkt a){
		return 1;
	}
}
